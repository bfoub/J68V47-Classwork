import javax.sound.midi.SysexMessage;
import java.util.*;
public class L4E1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String firstName = input.nextLine();

        System.out.print("Enter your last name: ");
        String lastName = input.nextLine();

        System.out.print("Value of order: ");
        Float orderValue = input.nextFloat();

        System.out.print("Deposit Amount: ");
        Float depositAmount = input.nextFloat();

        Float remainder = orderValue - depositAmount;


        System.out.println("\n");
        System.out.println("==RECEIPT==");
        System.out.format("Customer: %s %s \n", firstName.substring(0, 1), lastName);
        System.out.format("Order total: £%.2f \n", orderValue);
        System.out.format("Deposit paid: £%.2f \n", depositAmount);
        System.out.format("Remainder: £%.2f \n", remainder);

        if (depositAmount > 100) {
            System.out.println("You get a free toaster!");
        }
        System.out.println("Have a nice day");
    }
}
