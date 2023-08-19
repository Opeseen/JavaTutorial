import java.util.*;

public class Book {
  private String title;
  private String author;
  private String publisher;
  private String genre;
  
  public Book(String title, String author, String publisher, String genre){
    this.title = title;
    this.author = author;
    this.publisher = publisher;
    this.genre = genre;
 }

  public void Print(){
    System.out.println(title);
    System.out.println("\tWritten by: " + author);
    System.out.println("\tPublished by: " + publisher);
    System.out.println("\tIs a: " + genre); 
  }
}
