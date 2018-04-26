package com.myprojects.examples.java8.consumers.defaultMethod;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerFunctionalInterfaceTest {

    @Test
    public void shouldPrintTextByUsingConsumerWithoutLambda() throws  Exception{
        Consumer<String> printIt = new Consumer<String>() {
            @Override
            public void accept(String guide) {
                System.out.println("Awesome Guide:" + guide);
            }
        };

        printIt.accept("Java 8");
    }

    @Test
    public void shouldPrintTextByUsingConsumerWithLambda() throws Exception{
        Consumer<String> printIt = guide -> System.out.println("Awesome Guide:" + guide);
        printIt.accept("Java 8");
    }

    @Test
    public void shouldSendAnEmail() throws Exception {
        User javaWarrior = new User("java-warrior@xyz.com");
        User javaBrave = new User("java-brave@xyz.com");
        User javaHipster = new User("java-hipster@xyz.com");

        List<User> javaFans = Arrays.asList(javaBrave, javaHipster, javaWarrior);
        javaFans.forEach(user-> EmailSender.sendFor(user));
    }

}
