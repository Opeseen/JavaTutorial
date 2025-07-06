public class ArithmeticOperations {

  double piValue = 3.14;
  static final double PI_VALUE = 3.14;

  public static void main(String[] args) {
    ArithmeticOperations arithmeticOperations = new ArithmeticOperations();
    int result2 = arithmeticOperations.sum(30,5);
    int result = addition(20,5);
    System.out.println("result is: " + result);
    System.out.println("result2 is: " + result2);
    System.out.println(PI_VALUE);
    System.out.println(arithmeticOperations.piValue);
  }

  public int sum(int num1, int num2){
    System.out.println(piValue);
    subtract(num1,num2);
    int result = num1 + num2;
    return result;
  }

  public int subtract(int num1, int num2){
    int result = num1 - num2;
    System.out.println("Subtract is: " + result);
    return result;
  }

  public static int addition(int num1, int num2){
    int result = num1 + num2;
    return result;
  }
}
