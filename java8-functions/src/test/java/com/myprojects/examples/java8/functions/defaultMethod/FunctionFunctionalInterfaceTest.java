package com.myprojects.examples.java8.functions.defaultMethod;

import org.junit.Test;

import java.util.function.Function;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class FunctionFunctionalInterfaceTest {

    @Test
    public void shouldConvertANumberAsStringToIntegerUsingFunctionWithAnnonymousClass() throws Exception{
        Function<String, Integer> convertToInteger = new Function<String, Integer>() {
            @Override
            public Integer apply(String numberAsString) {
                return Integer.valueOf(numberAsString);
            }
        };
        Integer number = convertToInteger.apply("10");
        assertThat(number, equalTo(10));
    }

    @Test
    public void shouldConvertANumberAsStringToIntegerUsingFunctionsWithLambda() throws  Exception{
        Function<String, Integer> convertToInteger = numberAsString -> Integer.valueOf(numberAsString);

        Integer number = convertToInteger.apply("10");
        assertThat(number, equalTo(10));
    }

    @Test
    public void shouldConvertANumberAsStringToIntegerAndMulitplyUsingAnonymousClass() throws Exception{
        Function<String, Integer> convertToInteger = new Function<String, Integer>() {
            @Override
            public Integer apply(String numberAsString) {
                return Integer.valueOf(numberAsString);
            }
        };

        Function<Integer, Integer> multiplyBy10 = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer number) {
                return number * 10;
            }
        };

        Integer number = convertToInteger.andThen(multiplyBy10).apply("10");
        assertThat(number, equalTo(100));
    }

    @Test
    public void shouldConvertANumberAsStringToIntegerAndMulitplyByUsingLambda() throws Exception{
        Function<String, Integer> converTotInteger  = numberAsString -> Integer.valueOf(numberAsString);

        Function<Integer, Integer> multiplyBy10  = number -> number *10;
        Integer number  = converTotInteger.andThen(multiplyBy10).apply("10");
        assertThat(number, equalTo(100));
    }
}
