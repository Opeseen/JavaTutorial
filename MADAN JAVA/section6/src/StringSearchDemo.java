public class StringSearchDemo {
  public static void main(String[] args) {
    String originalString = "Hello World!";
    int index = originalString.indexOf("!");
    int index1 = originalString.indexOf("World");
    int index2 = originalString.indexOf("@");

    boolean isContains = originalString.contains("World");
    boolean isContains2 = originalString.contains("world");
    boolean isPresent = originalString.contains("@");

    boolean startWith = originalString.contains("Hello");
    boolean endsWith = originalString.contains("ld");

    boolean isMatched = originalString.matches(".*World.*");

  }
}
