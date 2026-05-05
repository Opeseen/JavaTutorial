package com.eazybytes.method.reference;

public class Product {
  private String name;
  private int Price;

  public Product(String name, int price) {
    this.name = name;
    Price = price;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getPrice() {
    return Price;
  }

  public void setPrice(int price) {
    Price = price;
  }

  @Override
  public String toString() {
    return "Product{" +
        "name='" + name + '\'' +
        ", Price=" + Price +
        '}';
  }
}
