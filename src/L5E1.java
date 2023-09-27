import java.util.*;
public class L5E1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int userInput = input.nextInt();

        for (int count = 1; count <= 12; count++) {
            System.out.println(userInput * count);
        }

    }
}

