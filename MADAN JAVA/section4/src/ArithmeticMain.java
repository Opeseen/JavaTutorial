public class ArithmeticMain {
  public static void main(String[] args) {
    int result = ArithmeticOperations.addition(20,7);
    System.out.println(result);
    System.out.println(ArithmeticOperations.PI_VALUE);

    ArithmeticOperations arithmeticOperations = new ArithmeticOperations();
    int resultFromInstanceMethod = arithmeticOperations.sum(10,12);
    System.out.println(resultFromInstanceMethod);
    System.out.println(arithmeticOperations.piValue);
  }
}
