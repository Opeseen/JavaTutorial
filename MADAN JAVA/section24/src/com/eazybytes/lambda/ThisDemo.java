package com.eazybytes.lambda;

public class ThisDemo {
  public static void main(String[] args) {
    ThisDemo thisDemo = new ThisDemo();
    Printer lambdaPrinter = thisDemo.getLambdaPrinter();
    lambdaPrinter.print("Lambda Expression");

    Printer annonymousPrinter = thisDemo.getAnonymousPrinter();
    annonymousPrinter.print("Anonymous Inner Class");
  }

  public Printer getLambdaPrinter(){
    return msg -> System.out.println(msg + ":" + this.getClass());
  }

  public Printer getAnonymousPrinter(){
    Printer printer = new Printer() {
      @Override
      public void print(String input) {
        System.out.println(input + ":" + this.getClass());
      }
    };
    return printer;
  };
}
