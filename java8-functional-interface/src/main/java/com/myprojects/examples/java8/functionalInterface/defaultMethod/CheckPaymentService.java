package com.myprojects.examples.java8.functionalInterface.defaultMethod;

import com.myprojects.examples.java8.PaymentService;

public class CheckPaymentService implements PaymentService {
    @Override
    public double retrieveDefaultFees() {
        return 10.9;
    }

}
