package com.myprojects.examples.java8.comparators.defaultMethod;

public class PayPalPaymentService implements PaymentService{

    @Override
    public double retrieveDefaultFees() {
        return 10.9;
    }
}
