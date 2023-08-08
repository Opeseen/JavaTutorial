public class Switch {
  public static void main(String[] args){
    int y = 100;
    switch (y) {
      case 1: case 6: case 10:
      System.out.println("Red");
      break;
      case 2:
      System.out.println("Yellow");
      break;
      case 3:
      System.out.println("Blue");
      break;
      default:
      System.out.println("None");
    }
  }
}