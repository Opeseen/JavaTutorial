import java.util.*;

public class arrays{
  public static void main(String[] args){
    char[] alpha = new char[26];

    for(int i = 0; i < 26; i++){
      alpha[i] = (char) (97 + i);
    }
    System.out.println(Arrays.toString(alpha));

    // Multi-Dimentional Array
    char [][] board = new char [8][8];
    boolean isWhite = false;
    for(int i = 0; i < board.length; i++){
      isWhite = !isWhite;
      for(int j = 0; j < board[i].length; j++){
        if(isWhite) board[i][j] = 'W';
        if(!isWhite) board[i][j] = 'B';
        isWhite = !isWhite;
      }
    }
    for(int i = 0; i < board.length; i++){
      System.out.println(Arrays.toString(board[i]));
    }

    // Array List
    Scanner reader = new Scanner(System.in) ;
    ArrayList<String> memory = new ArrayList<String>();
    while(true){
      memory.add(reader.nextLine());
      if((memory.get(memory.size() - 1)).equals("CLEAR")) 
        memory.clear();
      else{
        if((memory.get(memory.size() - 1)).equals("END")) break;
      } 
      System.out.println(memory.toString());
    }
  }
}