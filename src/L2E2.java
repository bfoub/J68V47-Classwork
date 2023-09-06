import java.util.Scanner;
public class L2E2 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        float a = input.nextFloat();
        System.out.print("Enter second number: ");
        float b = input.nextFloat();

        System.out.println(a + " + " +  b + " = " + (a + b));
        System.out.println(a + " - " +  b + " = " + (a - b));
        System.out.println(a + " * " +  b + " = " + (a * b));
        System.out.println(a + " / " +  b + " = " + (a / b));
        System.out.println(a + " % " +  b + " = " + (a % b));
        System.out.println(a + " to the power of " +  b + " = " + (Math.pow(a,b)));
    }
}
