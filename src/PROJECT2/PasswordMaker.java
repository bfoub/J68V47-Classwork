package PROJECT2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class PasswordMaker {
    public static String generatePassword() {
        Random rand = new Random();

        String[] specialChars = {"!", "@", "£", "$", "_"};
        String[] characters = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        String[] numbers = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};
        int randomSpecial = rand.nextInt(specialChars.length-1);
        int randomCharacter = rand.nextInt(characters.length-1);
        int randomNumber = rand.nextInt(numbers.length-1);

        List<String> passList = new ArrayList<>();
        //create list

        passList.add(specialChars[randomSpecial]);
        //adds 1 random special characters to list

        passList.add(numbers[randomNumber]);
        randomNumber = rand.nextInt(numbers.length-1);
        passList.add(numbers[randomNumber]);
        randomNumber = rand.nextInt(numbers.length-1);
        //adds 2 random numbers to list

        for(int i = 0; i < 6; i++) {
            passList.add(characters[randomCharacter]);
            randomCharacter = rand.nextInt(characters.length-1);
        } //adds 6 random lower case characters to list

        for(int i = 0; i < 2; i++) {
            passList.add(characters[randomCharacter].toUpperCase());
            randomCharacter = rand.nextInt(characters.length-1);
        } //adds 2 random uper case characters to list

        Collections.shuffle(passList);
        //shuffles the List

        String pass = String.join("", passList);
        //makes list into a string

        return pass;
        //return string
    }
}
