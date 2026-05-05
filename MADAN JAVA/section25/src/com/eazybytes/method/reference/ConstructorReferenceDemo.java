package com.eazybytes.method.reference;

public class ConstructorReferenceDemo {
  public static void main(String[] args) {
    ProductInterface productInterface = (name, price) -> new Product(name, price);
    System.out.println(productInterface.getProduct("Apple Mac", 2000));
    System.out.println();
    ProductInterface constructorReference = Product::new;
    System.out.println(constructorReference.getProduct("Apple Iphone", 1000));
  }

}
