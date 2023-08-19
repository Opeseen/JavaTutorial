public class Literature {
  protected String title;
  private String author;

  public Literature(String title, String author){
    this.title = title;
    this.author = author;

  }
  public void Print(){
    System.out.println(title);
    System.out.println("\tTested by: " + author);
  }
}
