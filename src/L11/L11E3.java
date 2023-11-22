package L11;
import java.io.*;
import java.util.*;

public class L11E3 {
    public static void main(String[] args) throws FileNotFoundException {

       //reader
       try ( Scanner in = new Scanner(new FileReader("L11/numbers.txt"))) {
        int total = 0;
        while (in.hasNextLine()) {
            total += in.nextInt();
        }

        System.out.println(total);

       } catch (IOException e) {
        System.out.print("Error occured when reading file: " + e.toString());
       }

    }
}
