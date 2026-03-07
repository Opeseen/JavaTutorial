package com.eazybytes.generics;

public class GenericPair<T,U> {
  private T First;
  private U second;

  public GenericPair(T first, U second) {
    First = first;
    this.second = second;
  }

  public T getFirst() {
    return First;
  }

  public void setFirst(T first) {
    First = first;
  }

  public U getSecond() {
    return second;
  }

  public void setSecond(U second) {
    this.second = second;
  }
}
