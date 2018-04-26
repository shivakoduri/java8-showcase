package com.myprojects.examples.java8.consumers.defaultMethod;

public class EmailSender {

    public static void sendFor(User user){
        System.out.println("Sending email to:" + user.getEmail());
    }
}
