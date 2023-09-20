import java.util.*;
public class L4E2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is the capital of spain: ");
        String answer = input.nextLine().toLowerCase();

        if (!answer.equals("madrid")) {
            System.out.println("The correct answer is Madrid");
        }

        System.out.println("What is the capital of the UK: ");
        String answer1 = input.nextLine().toLowerCase();

        if (!answer1.equals("london")) {
            System.out.println("The correct answer is London");
        }

        System.out.println("What is the capital of Italy: ");
        String answer2 = input.nextLine().toLowerCase();

        if (!answer2.equals("rome")) {
            System.out.println("The correct answer is Rome");
        }
    }
}