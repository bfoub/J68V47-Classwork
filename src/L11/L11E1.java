package L11;
import java.io.*;
import java.util.*;

public class L11E1 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int userinput = scanner.nextInt();
        String sum;

        //writer
        try {
            FileWriter out = new FileWriter("text.txt");
            for (int i = 1; i <= 12; i++) {
            sum = (i +  " * " + userinput + " = " + i * userinput + "\n");
            out.write(sum);
        }
            out.close();

       } catch (Exception e) {
        System.out.println("Error when writing to file: " + e.toString());
       }

    }
}
