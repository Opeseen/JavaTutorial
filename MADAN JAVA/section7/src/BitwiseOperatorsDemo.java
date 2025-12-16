public class BitwiseOperatorsDemo {
  public static void main(String[] args) {

    int x = 9;
    int y = ~x;

    int x1 = 10;
    int y1 = 6;
    int z1 = x1 & y1;

    int z2 = x1 | y1;

    int z3 = x1 ^ y1;

    int z4 = 11 << 2;

    int x2 = 50;
    int x3 = -50;
    int z5 = x2 >> 3;
    int z6 = x3 >> 3;

    int z7 = x1 >>> 2;

    int x4 = 10;
    int y4 = 6;
    x4 &= y4;

  }
}
