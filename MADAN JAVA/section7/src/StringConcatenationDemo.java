public class StringConcatenationDemo {
  public static void main(String[] args) {
    String output = 4 + 2 + " goals";
    int num1 = 4;
    int num2 = 2;
    String str1 = " goals";
    String input = num1 + num2 + str1;
    input = num1 + (num2 + str1);
    input = "" + num1 + num2 + str1;

    boolean b = false;
    input = b + (num1 + num2 + str1);

    String str2 = null;
    String str3 = 6 + str2;
    String str4 = "goals" + str2;

    int result = 9/2;
    float result2 = 27/2.0f;

    int result3 = 21%2;

    byte num7 = 9;
    byte num8 =3;

    num8 = (byte) +num8;

    byte num9 = 9;
    byte num10 =3;

    num7 = (byte) -num8;

    byte num11 = -(-9);

  }
}

