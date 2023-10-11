import java.util.*;
import java.time.LocalTime;
public class L7E1 {

    public static void showMenu(){
        System.out.println("[1]Tell current time, [2]Tell me a Joke, [3]Give me a random number 1-50, [4]exit");
    }

    public static void tellTime(){
        System.out.println(LocalTime.now());
    }

    public static void tellJoke(){
        System.out.println("What do you call an angry carrot?\n" +
                "\n" +
                "A steamed veggie.");
    }

    public static void randomNumber(){
        Random rand = new Random();
        int number = rand.nextInt(50);
        System.out.println(number);
    }

    public static int getOption(){
        Scanner input = new Scanner(System.in);
        int option = input.nextInt();
        return option;
    }
    public static void main(String[] args) {

        int option = -1;
        while (option != 4) {
            showMenu();
            option = getOption();
            if (option == 1) {
                tellTime();
            }
            else if (option == 2) {
                tellJoke();
            }
            else if (option == 3) {
                randomNumber();
            }
        }
    }
}
