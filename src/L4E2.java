import java.util.*;
public class L4E2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is the capital of spain: ");
        String answer = input.nextLine().toLowerCase();

        if (answer.equals("madrid")) {
            System.out.println("Correct");
        } else {
            System.out.println("The correct answer is Madrid");
        }

    }
}