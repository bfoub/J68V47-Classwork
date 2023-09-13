import java.util.*;
public class L3E2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is the capital of spain: ");

        String answer = input.nextLine().toLowerCase();
        boolean checkedAnswer = answer.contains("madrid");

        System.out.println(checkedAnswer);
    }
}
