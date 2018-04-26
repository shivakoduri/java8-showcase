package com.myprojects.examples.java8.comparators.defaultMethod;

import org.junit.Test;

import java.util.Comparator;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.number.OrderingComparison.greaterThan;
import static org.hamcrest.number.OrderingComparison.lessThan;

public class ComparatorFucntionalInterfaceTest {

        @Test
        public void shouldCompareTwoByUsingComparator() throws Exception{
            SomeClass mockito = new SomeClass("Mockito");
            SomeClass java = new SomeClass("Java 8");

            Comparator<SomeClass> comparator = new Comparator<SomeClass>() {
                @Override
                public int compare(SomeClass o1, SomeClass o2) {
                    return o1.getName().compareTo(o2.getName());
                }
            };
            int compared = comparator.compare(mockito, java);
            assertThat(compared, greaterThan(0));
        }

        @Test
        public void shouldCompareTwoByUsingComparatorWithLambda() throws Exception{
            SomeClass mockito = new SomeClass("Mockito");
            SomeClass java = new SomeClass("Java 8");
            Comparator<SomeClass> comparator = (first, second) -> first.getName().compareTo(second.getName());

            int compared = comparator.compare(mockito, java);
            assertThat(compared, greaterThan(0));
        }

        @Test
        public void shouldCompareAndReverseByUsingComparator() throws Exception{
            SomeClass mockito = new SomeClass("Mockit");
            SomeClass java = new SomeClass("Java 8");

            Comparator<SomeClass> comparator = (first, second) -> first.getName().compareTo(second.getName());
            int compared = comparator.reversed().compare(mockito, java);
            assertThat(compared, lessThan(0));
        }
    }
