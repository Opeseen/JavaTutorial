// importing required packages  
import java.io. * ;  
import java.util. * ;  
  
public class ArrayExample {  
  public static void main(String[] args) throws IOException {  
    int i;  
    Scanner sc = new Scanner(System. in );  
    // declaring and initializing an array  
    int arr[] = {1, 2, 3, 6, 9};  
    // defining another array arr1  
    int arr1[] = new int[5];  
    // reading values from the user  
    System.out.println("Enter the numbers (size = 5) :");  
    for (i = 0; i < 5; i++) {  
      arr1[i] = sc.nextInt();  
    }  
    System.out.println("Previous array with initialized size is: ");  
    for (i = 0; i < 5; i++) {  
      System.out.print(arr[i] + " ");  
    }  
    System.out.println("\nThe new array we have entered is:");  
    for (i = 0; i < 5; i++) {  
      System.out.print(arr1[i] + " ");  
    }  
  }  
}  