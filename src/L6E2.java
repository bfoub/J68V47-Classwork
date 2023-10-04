import java.util.*;
public class L6E2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userInput = "";

        while (!userInput.equals("Q"))
        {
            System.out.println("Tell me a joke [1], Tell me the time [2], Soup of the day [3], ['Q' to quit] ");
            userInput = input.nextLine();
        }
    }
}
