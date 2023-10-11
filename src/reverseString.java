import java.util.*;

public class reverseString {

    public static void main(String[] args) {
        System.out.println("Enter your name and I will display it backwards: ");
        Scanner input = new Scanner(System.in);

        String userMessage = input.nextLine();
        int messageLength = userMessage.length();

        List<String> reversedName = new ArrayList<>();

        for (int i = 0; i < messageLength; i++)
        {
            int firstNumber = i;
            int secondNumber = i;
            secondNumber++;

            String letter = userMessage.substring(firstNumber, secondNumber);
            reversedName.add(letter);
        }

        for (int i = reversedName.size() - 1; i >= 0; i--)
        {
            System.out.print(reversedName.get(i));
        }

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");

        System.out.println("     /|");
        System.out.println("    /-|");
        System.out.println("   /--|");
        System.out.println("  /---|");
        System.out.println(" /----|");
        System.out.println("/-----|");
        System.out.println("     |-----/");
        System.out.println("     |----/");
        System.out.println("     |---/");
        System.out.println("     |--/");
        System.out.println("     |-/");
        System.out.println("     |/");

    }
}
