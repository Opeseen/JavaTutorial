public class Inheritance {
  public static void main(String[] args){
    Book a = new Book("Lord of the ring","Ope","Seadorf","Movies");
    Poem b = new Poem("Summer","Winter","Rainny");

    Literature[] list = new Literature[6];
    list[0] = a;
    list[1] = b;
    list[2] = b;
    list[3] = a;
    list[4] = a;
    list[5] = b;

    a.Print();
    b.Print();
    System.out.println(a);
    for(int i = 0; i < list.length; i++){
      list[i].Print();
    }
  }
}
