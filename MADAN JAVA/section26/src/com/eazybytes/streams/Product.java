package com.eazybytes.streams;

public class Product {
  private String name;
  private int price;

  public Product(String name, int price) {
    this.price = price;
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public int getPrice() {
    return price;
  }

  @Override
  public String toString() {
    return "Product{" +
        "name='" + name + '\'' +
        ", price=" + price +
        '}';
  }
}


