import java.util.Scanner;

public class Loop{
  public static void main(String[] args){
    Scanner reader = new Scanner(System.in);
    String input;
    String all = "";
    // int x = 5;

    // While Loop
    // while(x > 0){
    //   x--;
    //   input = reader.nextLine();
    //   all += input;
    //   x--;
    //   System.out.println(all);
    // }
    
    // Do While Loop
    // do{
    //   input = reader.nextLine();
    //   all += input;
    // }while(!input.equals("stop"));
    // System.out.println(all);

    // Fpr Loops
    for(int x = 0; x <= 100; x++){
      System.out.println((x));
    }
  }
}