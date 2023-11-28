package PROJECT2;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.*;

public class app {

    public static boolean UserExists(String user) {
        boolean userExists = false;
        int userFound = 0;

        try {
            Scanner currentUsers = new Scanner(new FileReader("PROJECT2/UserAccounts.txt"));
            while (currentUsers.hasNextLine()) {
                if (user.equals(currentUsers.nextLine())) {
                userFound++;
                }
            }
        }
        catch (Exception e) {
            System.out.println(e.toString());
        }

        if (userFound >= 1) {
            userExists = true;
        }
        else if (userFound == 0) {
            userExists = false;
        }

        return userExists;
    }

    public static void register() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a username: ");
        String username = scanner.nextLine();

        System.out.println("Enter a password: ");
        String password = scanner.nextLine();


        String user = String.format("%s, %s", username, password);

        if (UserExists(user) == true) {
            System.out.println("\nUnable to make account, User already exists.");
        }

        else if (UserExists(user) == false) {
            try {
                FileWriter fw = new FileWriter("PROJECT2/UserAccounts.txt", true);
                PrintWriter pw = new PrintWriter(fw);
                pw.print("\n" + user);
                pw.close();
            }
             
            catch (Exception e) {
                System.out.print(e.toString());
            }
        }
    }

    public static void login() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a username: ");
        String username = scanner.nextLine();

        System.out.println("Enter a password: ");
        String password = scanner.nextLine();

        String user = String.format("%s, %s", username, password);

        if (UserExists(user) == true) {
            System.out.format("\nWELCOME! %s", username);
            userChoices(username);
        }

        else if (UserExists(user) == false) {
            System.out.println("\nThis user doesnt exist, would you like to register? ");
        }
    }

    public static void displayPasswords(String username) {
        try {
            Scanner currentSites = new Scanner(new FileReader("PROJECT2/Users/"+ username + ".txt"));
            while(currentSites.hasNextLine()) {
                System.out.print("\n" + currentSites.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void makePassword(String username) {
        Scanner scanner = new Scanner(System.in);
        String sitePassword = "pass";

        System.out.print("Enter site name: ");
        String siteName = scanner.nextLine();
        System.out.print("Use Password generator[1], Create Custom password[2]: ");
        int passwordChoice = scanner.nextInt();

        if (passwordChoice == 1) {
            sitePassword = PasswordMaker.generatePassword();
        }
        else if (passwordChoice == 2) {
            sitePassword = scanner.nextLine();
        }

        try {
                FileWriter fw = new FileWriter("PROJECT2/Users/"+ username + ".txt", true);
                PrintWriter pw = new PrintWriter(fw);
                pw.format("\n%s, %s", siteName, sitePassword);
                pw.close();
            }
             
            catch (Exception e) {
                System.out.print(e.toString());
            }
    }

    public static void userChoices(String username) {
        Scanner scanner = new Scanner(System.in);
        int userInput = 1;

        while (userInput != 0) {
        System.out.println("\n\nUSER CHOICE MENU\nDisplay your passwords[1], Make a new password[2], Main Menu[0]");
        userInput = scanner.nextInt();

        if (userInput == 1) {
            displayPasswords(username);
        }
        else if (userInput == 2) {
            makePassword(username);
        }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInput = 1;

        while (userInput != 0) {
        System.out.println("\nMAIN MENU\nLogin to account[1], Register account[2], Exit[0]");
        userInput = scanner.nextInt();

        if (userInput == 1) {
            login();
        }
        else if (userInput == 2) {
            register();
        }
        }
    }

}