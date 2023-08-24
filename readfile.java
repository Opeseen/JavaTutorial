import java.io.*;
import java.util.*;
public class readfile{
    public static void main(String[] args) throws IOException{
        File outFile = new File("Outputfile.txt");
        File inFile = new File("Inputfile.txt");

        FileWriter out = new FileWriter(outFile);
        BufferedReader in = new BufferedReader(new FileReader(inFile));
        // Scanner in = new Scanner(new BufferedReader(new FileReader(inFile)))

        String input = "";
        String newInput;
        while((newInput = in.readLine()) != null){
            input += (newInput + "\r\n");
        }
        out.write(input);
        out.close();
        in.close();
    }
}