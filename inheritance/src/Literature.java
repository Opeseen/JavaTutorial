public abstract class Literature {
  // Note - A class decorated "abstract" class will not be instianted on its own but when only as a super class
  // Protected - This makes it accessible by its class and sub-class
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
