package L11;
import java.io.*;

public class L11E2 {
    public static void main(String[] args) throws FileNotFoundException {

       try ( BufferedReader in = new BufferedReader(new FileReader("text.txt"))) {
        String line;

        while ((line = in.readLine()) != null) {
            System.out.println(line);
        }

        in.close();

       } catch (IOException e) {
        System.out.print("Error occured when reading file: " + e.toString());
       }

    }
}
