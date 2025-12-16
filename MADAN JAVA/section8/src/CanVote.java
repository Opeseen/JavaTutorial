public class CanVote {
  public static void main(String[] args) {
    boolean isCitizen = true;
    int age = 19;

    if(isCitizen && age > 18){
      System.out.println("Can vote");
    }else{
      System.out.println("Can't vote");
    }
  }
}


