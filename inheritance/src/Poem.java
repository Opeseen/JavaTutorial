public class Poem extends Literature {
  public String styles;

  public Poem(String title, String author, String styles){
    super(title, author);
    this.styles = styles;
  }
  @Override public void Print(){
    super.Print();
    System.out.println(title);
    System.out.println("\tIn the Style of: " + styles);
  }

}
