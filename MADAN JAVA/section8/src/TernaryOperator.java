public class TernaryOperator {
  public static void main(String[] args) {
    int x = 10 , y;
    y = x > 5 ? 20 : 30;
    System.out.println(y);
    sum(x, x > 5 ? 20 : 30 );
  }

  public static void sum (int x, int y) {
    System.out.println(x+y);
  }

}
