import java.util.*;
public class L3E1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name: ");
        String firstName = input.nextLine();

        System.out.println("Enter your last name: ");
        String lastName = input.nextLine();

        System.out.println("Enter your Date of Birth YYYY: ");
        int DoB = input.nextInt();

        String username = firstName.substring(0, 1) + lastName.toLowerCase();
        String password = lastName.toLowerCase().substring(0, 1) + firstName.substring(0,3).toUpperCase() + DoB;

        System.out.println(username);
        System.out.println(password);
    }
}