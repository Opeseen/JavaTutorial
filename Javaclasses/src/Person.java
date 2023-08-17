import java.util.*;

public class Person {
  public String lastname;
  public String firstname;
  public Calendar birthday; 

  public int age(Calendar today){
    return today.get(Calendar.YEAR) - birthday.get(Calendar.YEAR);
  }
}
