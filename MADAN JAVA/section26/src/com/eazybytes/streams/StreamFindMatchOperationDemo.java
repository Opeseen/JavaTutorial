package com.eazybytes.streams;

import java.util.List;
import java.util.Optional;

public class StreamFindMatchOperationDemo {
  public static void main(String[] args) {
    List<Item> items = getItems();
    boolean allInStock = items.stream().allMatch(Item::isInStock);
    System.out.println(allInStock);

    boolean anyOnSale = items.stream().anyMatch(Item::isOnSale);
    System.out.println(anyOnSale);

    boolean anyOutOfStock = items.stream().anyMatch(item -> !item.isInStock());
    System.out.println(anyOutOfStock);

    boolean isAnyCostlyProduct = items.stream().noneMatch(item -> item.getPrice() > 5000);
    System.out.println(isAnyCostlyProduct);

    Optional<Item> randomItemOptional = items.stream().filter(item -> item.getPrice() > 1000).findAny();
    System.out.println(randomItemOptional);

    Optional<Item> firstItemOptional = items.stream().filter(item -> item.getPrice() > 1000).findFirst();
    System.out.println(firstItemOptional);
  }

  private static List<Item> getItems(){
    return List.of(
        new Item("Laptop", 1200, true, false),
        new Item("Smartphone", 800, true, true),
        new Item("Headphones", 150, false, true),
        new Item("Camera", 2000, true, true),
        new Item("Smartwatch", 300, true, false)
    );
  }
}
