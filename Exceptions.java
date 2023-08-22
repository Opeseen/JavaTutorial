import java.util.*;
public class Exceptions {
  public static void main(String[] args){
    Scanner reader = new Scanner(System.in);
    while(true){
      try{
        System.out.print("Input Number: ");
        float input = reader.nextFloat();
        System.out.println("You input the number: " + input);
        System.out.println("\r\n");
      }catch(InputMismatchException error){
        // System.out.println("You passed an invalid input: ");
        System.out.println("You passed an invalid input: ");
        System.out.println("\r\n");
        error.printStackTrace(System.out);
        // break;
        // reader.nextLine();
      }finally{
        reader.nextLine();
      }
      
    }
  }
}