package com.eazybytes.set;

import java.util.HashSet;
import java.util.Set;

public class SetOperationsDemo {
  public static void main(String[] args) {
    Set<Integer> hashSet1 = new HashSet<>();
    hashSet1.add(7);
    hashSet1.add(4);
    hashSet1.add(1);

    Set<Integer> hashSet2 = new HashSet<>();
    hashSet2.add(1);
    hashSet2.add(7);

    // union
    hashSet1.addAll(hashSet2);
    System.out.println(hashSet1);
    System.out.println(hashSet2);
    System.out.println();
    // intersection
    hashSet1.retainAll(hashSet2);
    System.out.println(hashSet1);
    System.out.println(hashSet2);
    hashSet1.removeAll(hashSet2);
    System.out.println(hashSet1);
    boolean isSubSet = hashSet1.containsAll(hashSet2);

  }
}
