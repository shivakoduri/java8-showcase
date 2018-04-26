package com.myprojects.examples.java8.defaultMethod;

public class MoipPaymentService implements PaymentService {

    @Override
    public double discount() {
        return 0.10;
    }
}
