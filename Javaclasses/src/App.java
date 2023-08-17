import java.util.*;
public class App{
  public static void main(String[] args){
    Person John = new Person();
    John.firstname = "Johnny";
    John.lastname = "jerry";
    John.birthday = new GregorianCalendar(1993, 10, 30);

    System.out.println(John.firstname + " " + John.lastname);
    System.out.println("John is " + John.age(new GregorianCalendar()));
  }
}