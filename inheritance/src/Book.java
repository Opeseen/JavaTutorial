public class Book extends Literature{
  private String publisher;
  private String genre;
  
  public Book(String title, String author, String publisher, String genre){
    super(title, author);
    this.publisher = publisher;
    this.genre = genre;
  }

  @Override public void Print(){
    super.Print();
    System.out.println("\tPublished by: " + publisher);
    System.out.println("\tIs a: " + genre); 
  }
}
