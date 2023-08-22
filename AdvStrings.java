public class AdvStrings{
  public static void main(String[] args){
    String s1 = new String("Strings are arrays of characters");
    String s2 = new String("Strings are arrays of characters");
    
    System.out.println("String1: " + s1.replace("characters","char"));
    System.out.println("String1: " + s1);
    System.out.println("String2: " + s2);
    System.out.println("Strings are arrays of characters" == "Strings are arrays of characters");
    System.out.println(s1 == s2);
    System.out.println(s1.equals(s2));


  }

}