import java.util.*;
public class L7E2 {

    public static int calculateSum(int x, int y){
        int num = x + y;
        return num;
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();

        System.out.format("The sum of %d and %d is %d", num1, num2, calculateSum(num1, num2));
    }

}
