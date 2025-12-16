public class ForLoopDemo {
  public static void main(String[] args) {
    int result;
    for(int i=1; i<=10; i++){
      result = i*5;
      System.out.println("5 * " + i + "=" + result);
    }

    for(;;){
      System.out.println("HI!");
    }
  }
}
