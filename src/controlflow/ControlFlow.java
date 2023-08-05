package controlflow;

import java.util.*;
public class ControlFlow {

    public static void main(String[] args) {
        // IF STATEMENTS.
        Scanner reader = new Scanner(System.in);
        System.out.print("Input Now: ");
        String input = reader.next();
        System.out.println(input);
        System.out.print("Input Number: ");
        int number = reader.nextInt();
         
        if(number > 10){
            System.out.println(number);
        }
        else if(number == 10){
            System.out.println("Number Less or Equal To Ten!");
        }
        else{
            System.out.println("Invalid Input");
        }
         
    }
    
}
