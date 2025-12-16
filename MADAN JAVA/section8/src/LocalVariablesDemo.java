public class LocalVariablesDemo {
  public static void main(String[] args) {

    for(int i=0; i<5; i++){ // i declared as local variable
      int x = i*2; // x as local variable
      System.out.println("i=" + i+",x=" + x);
    }
  }

  public void myMethod(){
    int x = 10;
    System.out.println(x);
  }
}
