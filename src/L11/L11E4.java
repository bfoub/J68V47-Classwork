package L11;
import java.io.FileReader;
import java.util.*;

public class L11E4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter a file name: ");
        String file1 = scanner.nextLine();

        System.out.println("Enter a file name: ");
        String file2 = scanner.nextLine();


        try {
            Scanner in1 = new Scanner(new FileReader("L11/" + file1 + ".txt"));
            Scanner in2 = new Scanner(new FileReader("L11/" + file2 + ".txt"));

            while (in1.hasNextLine() && in2.hasNextLine()) {

                if (in1.nextLine().equals(in2.nextLine())) {
                    System.out.println("These lines are the same!");
                }
                else if (!in1.nextLine().equals(in2.nextLine())) {
                    System.out.println("These lines are not the same");
                }
            }

        } catch (Exception e){
            System.out.println(e.toString());
        }
    }
}
