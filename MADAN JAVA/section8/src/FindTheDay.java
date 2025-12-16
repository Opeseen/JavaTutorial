public class FindTheDay {
  public static void main(String[] args) {
    String whatIsToday = "Monday";
    if(whatIsToday.equals("Monday")) {
      System.out.println("It's weekday");
    }else if(whatIsToday.equals("Tuesday")){
      System.out.println("It's weekday");
    }else if(whatIsToday.equals("Saturday")){
      System.out.println("It's weekend");
    }else{
      System.out.println("Invalid input, Please try again");
    }
  }
}
