package com.eazybytes.map;

import java.util.Map;
import static java.util.Map.entry;

public class ImmutableMapDemo {
  public static void main(String[] args) {

    Map<String, Integer>stringIntegerMap = Map.of(
        "a", 1, "b",2, "c", 3
    );
    processMap(stringIntegerMap);
    System.out.println();
     Map<Integer, String> integerStringMap = Map.ofEntries(
        entry(1, "Ten"),
        entry(2, "Dick"),
        entry(3, "Harry")
    );
     processMap1(integerStringMap);
  }

  public static void processMap(Map<String, Integer> stringIntegerMap){
    // stringIntegerMap.remove("a"); // will through exception here because it's immutable
    for (Map.Entry<String, Integer> entry: stringIntegerMap.entrySet()){
      System.out.println(entry.getKey() + " - " + entry.getValue());
    }
  }

  public static void processMap1(Map<Integer, String> integerStringMap){
    // integerStringMap.put(4,"John"); // will through exception here because it's immutable
    for (Map.Entry<Integer, String> entry: integerStringMap.entrySet()){
      System.out.println(entry.getKey() + " - " + entry.getValue());
    }
  }
}
