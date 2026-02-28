package com.eazybytes.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableListDemo {
  public static void main(String[] args) {
    List<Integer> accountNums = new ArrayList<>();
    accountNums.add(123456);
    accountNums.add(345678);
    accountNums.add(894601);
    accountNums = Collections.unmodifiableList(accountNums);
    List<Integer> immutableAccountNums = List.of(123456,345678, 894601);
    var arrayListObject = new ArrayList<Integer>(immutableAccountNums);
    addTenDollars(arrayListObject);
  }

  private static List<Integer> addTenDollars(List<Integer> accountNums){
    accountNums.add(123456);
    for(Integer account: accountNums){
      System.out.println("Ten dollars credited into the account: " + account);
    }
    return accountNums;
  }
}
