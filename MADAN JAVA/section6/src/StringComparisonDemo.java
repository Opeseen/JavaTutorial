public class StringComparisonDemo {

  public static void main(String[] args) {
    String str1 = new String("Hey");
    String str2 = new String("Hello");
    String str3 = new String("Hey");

    boolean b1 = str1.equals(str2);
    boolean b2 = str1.equals(str3);

    System.out.println(b1);
    System.out.println(b2);

    boolean b3 = str1.equals("Hey");
    boolean b4 = "Hey".equals(str1);
    boolean b5 = "Hey".equals("Hello");

    String str4 = "java";
    String str5 = "JAVA";
    boolean b6 = str4.equals(str5);
    boolean b7 = str4.equalsIgnoreCase(str5);

    int compareTo = "java".compareTo("java");
    System.out.println(compareTo);
    int compareTo2 = "java".compareTo("python");
    System.out.println(compareTo2);
    int compareTo3 = "python".compareTo("java");
    System.out.println(compareTo3);
  }
}
