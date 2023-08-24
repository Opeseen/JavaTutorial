import java.io.*;

public class writefile{
    public static void main(String[] args) throws IOException{
        FileWriter out = null;
        try {
            out = new FileWriter("out.txt", true);
            for (long number: FibonacciNumbers()){
                out.write(String.valueOf(number) + "\r\n");
                // System.out.println(number);
            }
        } catch (IOException e) {
            System.err.println("File to failed");
            // e.printStackTrace();
        }finally{
            out.close();
        }
    }

    private static long[] FibonacciNumbers(){
        long[] FibonacciNumbers = new long[50];
        FibonacciNumbers[0] = 0;
        FibonacciNumbers[1] = 1;
        for(int i = 2; i < 50; i++){
            FibonacciNumbers[i] = FibonacciNumbers[i - 1] + FibonacciNumbers[i - 2];
        }
        return FibonacciNumbers;
    }

}