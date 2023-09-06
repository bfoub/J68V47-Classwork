import java.util.Scanner;
public class L2E3 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the name of the item(1): ");
        String itemName1 = input.nextLine();

        System.out.print("Enter the price of the item(1): ");
        Double itemPrice1 = input.nextDouble();


        System.out.print("Enter the name of the item(2): ");
        String itemName2 = input.nextLine();

        System.out.print("Enter the price of the item(2): ");
        Double itemPrice2 = input.nextDouble();


        //System.out.print("Enter the name of the item(3): ");
        //String itemName3 = input.nextLine();

        //System.out.print("Enter the price of the item(3): ");
        //Double itemPrice3 = input.nextDouble();

        //Double totalCost = (itemPrice1 + itemPrice2 + itemPrice3);

        System.out.println("Receipt: ");
        System.out.format("%s, £%.2f", itemName1, itemPrice1);
        System.out.format("%s, £%.2f", itemName2, itemPrice2);
        //System.out.format("%s, £%.2f", itemName3, itemPrice3);
        //System.out.format("total cost: £%.2f", totalCost);

    }
}
