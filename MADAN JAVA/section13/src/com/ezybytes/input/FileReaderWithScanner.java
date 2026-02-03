package com.ezybytes.input;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileReaderWithScanner {
  public static void main(String[] args) throws IOException {
    File file = new File("C:\\Users\\HomePC\\Downloads\\test.txt");
    Scanner sc = new Scanner(file);

    while (sc.hasNext()){
      System.out.println(sc.nextLine());
    }
    sc.close();
  }
}
