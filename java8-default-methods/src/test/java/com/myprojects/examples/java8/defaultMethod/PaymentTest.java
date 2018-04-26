package com.myprojects.examples.java8.defaultMethod;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class PaymentTest {

    @Test
    public void shouldCalculateTheOrderPriceUsingPayPalService() throws Exception {
        PaymentService payment = new PayPalPaymentService();

        double orderPrice = 100.0;
        double finalPrice = payment.calculeOrder(orderPrice);

        assertThat(finalPrice, equalTo(80.0));
    }

    @Test
    public void shouldCalculateTheOrderPriceUsingMoipService() throws Exception {
        PaymentService payment = new MoipPaymentService();

        double orderPrice = 100.0;
        double finalPrice = payment.calculeOrder(orderPrice);

        assertThat(finalPrice, equalTo(90.0));
    }
}
