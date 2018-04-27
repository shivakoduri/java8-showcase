package com.myprojects.examples.java8.stream.suppliers;

import java.util.Random;

public class RandomNumbers {

    public static Integer getNext() {
        return new Random().nextInt(10);
    }
}
