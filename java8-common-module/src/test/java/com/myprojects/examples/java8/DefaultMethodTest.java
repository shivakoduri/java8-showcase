package com.myprojects.examples.java8;

import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class DefaultMethodTest {

    /**
     * In this example, we don't need to use the default method send() from PaymentService interface
     */
    @Ignore
    @Test
    public void shouldRetrieveTheDefaultFees() throws Exception {
        PaymentService service = new PayPalPaymentService();

        double fees = service.retrieveDefaultFees();

        assertThat(fees, equalTo(10.9));
    }

    @Test
    public void shouldInvokeTheDefaultMethodFromPaymentService() throws Exception {
        PaymentService paymentService = new PayPalPaymentService();

        double valueSent = paymentService.send(20);

        assertThat(valueSent, equalTo(20.0));
    }

}
