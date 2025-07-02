public class HelloWorld {
//  matching main method that JVM is expecting
  public static void main(String[] args) {
    System.out.println("Hello World");
  }
  //  not matching main method that JVM is expecting
  public static void main(String[] args, float num) {
    System.out.println("Hello World2");
  }
  //  not matching main method that JVM is expecting
  public double main() {
    return 3.14;
  }

}
