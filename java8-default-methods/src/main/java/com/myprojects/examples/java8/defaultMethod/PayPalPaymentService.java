package com.myprojects.examples.java8.defaultMethod;

public class PayPalPaymentService implements PaymentService {

    @Override
    public double discount() {
        return 0.20;
    }

}
