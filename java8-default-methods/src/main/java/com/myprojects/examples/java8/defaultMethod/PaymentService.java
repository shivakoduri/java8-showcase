package com.myprojects.examples.java8.defaultMethod;

public interface PaymentService {

    double discount();

    default double calculeOrder(double orderPrice) {
        return orderPrice - (orderPrice * discount());
    }
}
