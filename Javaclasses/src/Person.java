import java.util.*;

public class Person {
  public String lastname;
  public String firstname;
  public Calendar birthday; 

  public Person(String Lname, String Fname){
    this.lastname = Lname;
    this.firstname = Fname;
    this.birthday = new GregorianCalendar(1993, 10, 30);
 }

  public int age(Calendar today){
  return today.get(Calendar.YEAR) - birthday.get(Calendar.YEAR);

  }
}
