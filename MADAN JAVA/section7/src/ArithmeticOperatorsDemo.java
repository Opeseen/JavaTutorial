public class ArithmeticOperatorsDemo {
  public static void main(String[] args) {
    byte num1;
    byte num2 = 5;
    byte num3 = 3;
    num1 = 8;
    num1 = (byte) (num2 + num3);
    num1 = 5+3;

    double num4;
    double num5 = 3.15;
    byte num6 = 3;
    num4 =  num5 + num6;
    System.out.println(num4);

    int num12 = 42;
    int num13 = 42;
    num12 += 3.3;
    num13 -= 3.3;

    String str = "Hello";
    str += 9; // the left operand var must be a string and can't also be used on subtract

    int num14 = 45;
    int num15 = 4;
    num15 = num14++ +5;

    int num16 = 45;
    int num17 = 4;
    num17 = ++num16 +5;

  }
}

