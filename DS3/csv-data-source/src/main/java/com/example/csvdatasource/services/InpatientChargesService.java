package com.example.csvdatasource.services;

import com.example.csvdatasource.models.InpatientCharges;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class InpatientChargesService {
    private static final String filePath = "C:/Users/ivasc/Documents/GitHub/Proiect_Integrare_Informationala/DS3/inpatientCharges.csv";
    public static List<InpatientCharges> getImpatientChargesList()
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
}
