public class MultiLineCommentDemo {
  /*
    This is an example of a multi line comment.
    Commenting to another line.
  */

  static final int MAX_RETRY_ATTEMPTS=3;
  public static void main(String[] args) {
    MultiLineCommentDemo obj = new MultiLineCommentDemo();
    double totalArea = obj.calculateRectangleArea(24.5, 34.6);
    System.out.println(totalArea);
  }

  public double calculateRectangleArea(double length, double width){
    return length * width;
  }
}
