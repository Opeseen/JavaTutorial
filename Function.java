import java.util.*;
public class Function{
  // First Function
  static String myFunction(String FirstName,String Lastname){
    return "My firstname is " + FirstName + " and my lastname is " + Lastname;
  }
  // Second Function
  public static void magic(int[] input){
    for(int x = 0; x < input.length; x++){
      input[x] -= 10;
    }
  }
  public static void main(String[] args){
    // Scanner reader = new Scanner(System.in);
    // String NameOne;
    // String NameTwo;
    // String result;

    // System.out.print("Input Firstname: ");
    // NameOne = reader.next();
    // System.out.print("Input Lastname: ");
    // NameTwo = reader.next();

    // result = myFunction(NameOne, NameTwo);
    // System.out.println(result);

    //..................................................................//

    // ADVANCE FUNCTIONS
    int[] x = {1,2,3,4,5,6};
    magic(x);

    System.out.println("Result is: " + Arrays.toString(x));
  }
}