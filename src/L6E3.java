import java.util.*;
public class L6E3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int lives = 3;

        while (lives > 0)
        {
            System.out.println("What is 10 + 10? ");
            int userInput = input.nextInt();

            if (userInput == 20)
            {
                System.out.println("Correct");
            }
            else {
                System.out.println("Incorrect, You lost a life");
                lives--;
            }
        }

        if (lives == 0)
        {
            System.out.println("You died! ! !");
        }
        else if (lives == 3) {
            System.out.println("Well done");
        }

        }
    }
}