import java.util.*;

public class Date_time {
  public static void main(String[] args){
    Calendar now = new GregorianCalendar();
    now.setTimeInMillis(0);
    System.out.println(now.getTimeInMillis());
    System.out.println(now.get(Calendar.MONTH) + 1);
    System.out.println(now.get(Calendar.DAY_OF_MONTH));
    System.out.println(now.get(Calendar.YEAR));
    
  }
}