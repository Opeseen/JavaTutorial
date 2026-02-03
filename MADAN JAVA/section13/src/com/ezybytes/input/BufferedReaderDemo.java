package com.ezybytes.input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderDemo {
  public static void main(String[] args) throws IOException {
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader bf = new BufferedReader(isr);
    System.out.println("Please enter a value...");
    String num = bf.readLine();
    System.out.println("The user entered a value: " + num);
    bf.close();
  }
}
