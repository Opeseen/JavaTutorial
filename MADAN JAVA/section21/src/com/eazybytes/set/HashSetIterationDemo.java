package com.eazybytes.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetIterationDemo {
  public static void main(String[] args) {
    Set<String> superpowers = new HashSet<>();
    superpowers.add("Invisibility");
    superpowers.add("Teleportation");
    superpowers.add("Mind Reading");
    superpowers.add("Super Strength");
    superpowers.add("Time Travel");

    superpowers.add("Laser Vision");
    superpowers.add("Weather manipulation");
    superpowers.add("Telekinesis");
    superpowers.add("Shape-Shifting");
    superpowers.add("Chaos Induction");

    for (String superpower: superpowers){
      System.out.println(superpower.toUpperCase());
    }
    System.out.println();

    Iterator<String> iterator = superpowers.iterator();
    while (iterator.hasNext()){
      String countryName = iterator.next();
      System.out.println(countryName.toLowerCase());
    }
  }
}
