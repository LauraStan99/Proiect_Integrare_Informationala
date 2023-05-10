package com.example.csvdatasource.services;

import com.example.csvdatasource.models.InpatientCharges;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class InpatientChargesService {
    private static final String filePath = "C:/Users/ivasc/Documents/GitHub/Proiect_Integrare_Informationala/DS3/inpatientCharges.csv";
    public static List<InpatientCharges> getInpatientChargesList()
    {
        List<InpatientCharges> inpatientChargesList = new LinkedList<>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
            String titleLine = bufferedReader.readLine();
            String line = bufferedReader.readLine();

            while( line != null ){
                String[] attributes = line.split(",");

                InpatientCharges tmpInpatientCharges = new InpatientCharges(attributes);

                inpatientChargesList.add(tmpInpatientCharges);

                line = bufferedReader.readLine();
            }

        }catch (IOException e){
            return null;
        }

        return inpatientChargesList;
    }

    public static InpatientCharges getInpatientCharges(String providerId)
    {
        InpatientCharges inpatientCharges = null;
        Double totalPaymentsAverage = 0.0;
        Integer numberOfEntries = 0;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
            String titleLine = bufferedReader.readLine();
            String line = bufferedReader.readLine();

            while( line != null ) {
                String[] attributes = line.split(",");

                if( attributes[0].equals(providerId) ) {

                    totalPaymentsAverage += Double.parseDouble(attributes[6].substring(1));
                    numberOfEntries += 1;

                    if( inpatientCharges == null ) {
                        inpatientCharges = new InpatientCharges(attributes);
                    }

                }

                line = bufferedReader.readLine();
            }

        }catch (IOException e){
            return null;
        }

        System.out.println(totalPaymentsAverage + " - " + numberOfEntries);
        inpatientCharges.setTotalPayments(totalPaymentsAverage / numberOfEntries);

        return inpatientCharges;
    }
}
