import java.util.Scanner;

public class L4E3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter total cost: £");
        int totalAmount = input.nextInt();

        if (totalAmount >= 50) {
            System.out.println("Shipping is free, Your total cost is £" + totalAmount);
        } else {
            System.out.println("Shipping cost is £10 for orders under £50");
            totalAmount = totalAmount + 10;

            System.out.println("Your updated cost is " + totalAmount);
        }

    }
}
