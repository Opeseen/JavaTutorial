import java.util.*;
public class map{
  public static void main(String[] args){
    ArrayList<String> FirstName = new ArrayList<String>();
    ArrayList<String> LastName = new ArrayList<String>();
    String[] allNamesOne = {"Mike","Yomex","tunde","Job","tom","John"};
    String[] allNamesTwo = {"Tyson","Alabi","odun","bly","marcus","cena"};
    for(int x = 0; x < allNamesOne.length; x++){
      FirstName.add(allNamesOne[x]);
    }
    for(int x = 0; x < allNamesTwo.length; x++){
      LastName.add(allNamesTwo[x]);
    }
    // System.out.println(FirstName);
    // System.out.println(LastName);
    Map<String,String> FullName = new HashMap<>();
    for(int x = 0; x < allNamesTwo.length; x++){
      FullName.put(allNamesOne[x].toLowerCase(),allNamesTwo[x].toLowerCase());
    }
    System.out.println(FullName.get("john"));
  }
}