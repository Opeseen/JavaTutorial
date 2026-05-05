package com.eazybytes.lambda;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaryOperatorDemo {
  public static void main(String[] args) {
    UnaryOperator<String> convertStr = (input) -> input.toUpperCase();
    System.out.println(convertStr.apply("Eazy Bytes"));

    UnaryOperator<String> someValue = UnaryOperator.identity();
    System.out.println(someValue.apply("Hi Madan"));

    UnaryOperator<Integer> doubleValue = num -> num * 2;
    UnaryOperator<Integer> addThree = num -> num + 3;

    Function<Integer, Integer> output1 = doubleValue.andThen(addThree);
    Function<Integer, Integer> output2 = doubleValue.compose(addThree);
    System.out.println(output1.apply(5));
    System.out.println(output2.apply(5));

  }
}
