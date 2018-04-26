package com.myprojects.examples.java8;

public interface PaymentService {
    double retrieveDefaultFees();

    default double send(double value) {
        System.out.println("Sending the value: " + value);

        return value;
    }


}
