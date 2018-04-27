package com.myprojects.examples.java8.lambdaexpression.defaultMethod;

import com.myprojects.examples.java8.PaymentService;

public class MoipPaymentService  implements PaymentService {

    @Override
    public double retrieveDefaultFees() {
        return 0;
    }
}
