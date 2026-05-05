package com.eazybytes.streams;

import java.util.List;
import java.util.stream.Stream;

public class ParallelStreamDemo {
  public static void main(String[] args) {
    Stream<Integer> numStream = Stream.iterate(1, num -> num + 1).limit(100);
    long startTime =System.currentTimeMillis();
    List<Integer> data = numStream.map(num -> {
      try {
        Thread.sleep(10);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
      return  num * 2;
    }).toList();
    System.out.println(data);
    long endTime = System.currentTimeMillis();
    System.out.println(endTime-startTime);

    System.out.println();

    Stream<Integer> numStream2 = Stream.iterate(1, num -> num + 1).limit(100).parallel();
    long startTime2 =System.currentTimeMillis();
    List<Integer> data2 = numStream2.map(num -> {
      try {
        Thread.sleep(10);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
      return  num * 2;
    }).toList();
    System.out.println(data2);
    long endTime2 = System.currentTimeMillis();
    System.out.println(endTime2 - startTime2);
  }
}
