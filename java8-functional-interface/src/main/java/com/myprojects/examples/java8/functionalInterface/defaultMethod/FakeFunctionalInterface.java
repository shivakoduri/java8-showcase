package com.myprojects.examples.java8.functionalInterface.defaultMethod;

@FunctionalInterface
public interface FakeFunctionalInterface {
    abstract String doSomething();

	//abstract String doAnotherSomething(); //If you remove the comment, the compiler will complain
}
