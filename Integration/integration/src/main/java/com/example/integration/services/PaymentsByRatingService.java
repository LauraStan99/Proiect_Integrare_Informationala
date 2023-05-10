package com.example.integration.services;

import com.example.integration.models.HospitalDetailsView;
import com.example.integration.models.InpatientChargesView;
import com.example.integration.models.PaymentsByRatingIntegrationView;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

public class PaymentsByRatingService {
    private static List<PaymentsByRatingIntegrationView> paymentsByRatingIntegrationViews = new LinkedList<>();
    public static List<PaymentsByRatingIntegrationView> getPaymentsByRating()
    {
        HospitalDetailsView[] hospitalDetailsViews = HospitalDetailsService.getHospitalDetails();
        InpatientChargesView[] inpatientChargesViews = InpatientChargesService.getInpatientCharges();


        Stream<InpatientChargesView> inpatientStream = Arrays.stream(inpatientChargesViews);


        inpatientStream.forEach(inpatient -> {
            Stream<HospitalDetailsView> hospitalStream = Arrays.stream(hospitalDetailsViews);
            hospitalStream.forEach(hospital -> {
                if(inpatient.getProviderName().equals(hospital.getHospitalName())){
                    PaymentsByRatingService.paymentsByRatingIntegrationViews.add(new PaymentsByRatingIntegrationView(hospital.getHospitalName(), hospital.getHospitalOverallRating(), inpatient.getTotalPayments()));
                }
            });
        });

        return PaymentsByRatingService.paymentsByRatingIntegrationViews;
    }
}
