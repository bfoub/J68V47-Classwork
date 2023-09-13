import java.util.*;

public class L3E3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Loan amount: £");
        int L = input.nextInt();

        System.out.print("Interest Rate (APR %): ");
        double j = input.nextDouble() / 100 / 12;

        System.out.print("Number of years: ");
        int n = input.nextInt() * 12;

        //double M = L(j / (1 - Math.pow((1+j) ,-n) ) );
        double M = L * (j / (1 - Math.pow((1 + j) , -n) ) );

        System.out.print("Monthly payments for this loan: ");
        System.out.print(M);
    }
}
