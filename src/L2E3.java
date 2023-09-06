import java.util.*;
public class L2E3 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name of the item(1): ");
        String itemName1 = input.nextLine();

        System.out.println("Enter the price of the item(1): ");
        Double itemPrice1 = input.nextDouble();

        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter the name of the item(2): ");
        String itemName2 = input1.nextLine();

        System.out.println("Enter the price of the item(2): ");
        Double itemPrice2 = input1.nextDouble();

        Scanner input2 = new Scanner(System.in);
        System.out.print("Enter the name of the item(3): ");
        String itemName3 = input2.nextLine();

        System.out.print("Enter the price of the item(3): ");
        Double itemPrice3 = input2.nextDouble();

        Double subtotal = (itemPrice1 + itemPrice2 + itemPrice3);

        System.out.println("Receipt: ");
        System.out.format("%s  £%.2f", itemName1,  itemPrice1);
        System.out.format("\n%s  £%.2f", itemName2,  itemPrice2);
        System.out.format("\n%s  £%.2f", itemName3,  itemPrice3);
        System.out.format("\nSUBTOTAL: £%.2f", subtotal);

    }
}
