import java.util.Scanner;
public class Lesson2
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = input.nextLine();

        System.out.print("Enter your hobby: ");
        String hobby = input.nextLine();

        System.out.println(name + " loves " + hobby + " in their free time.");
        System.out.println(hobby + " provides " + name + " with a lot of joy and a way to be creative");
        System.out.println(hobby + " is a great pastime that is used by people all over the world.");

        //int a = 2;
        //int b = 5;

        //System.out.println(a + " * " + b + " = " +  a * b);
    }
}
