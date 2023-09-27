import java.util.*;
public class L5E3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int score = 0;

        String[] questions = {"Q1: What is 10 + 10? ", "Q2: What is 10 + 5? ", "Q3: What is 20 + 10? ", "Q4: What is 40 + 10? ", "Q5: What is 90 + 10? " };
        String[] answers = { "20", "15", "30", "50", "100" };
        List<String> userAnswers = new ArrayList<String>();


        //Outputs question for each one in the array and appends the answers to a list
        for (int count = 0; count < questions.length; count++){
            System.out.println(questions[count]);
            //displays question for each one in the array ^

            String userAnswer = input.nextLine();
            //takes in users answers to question ^

            userAnswers.add(userAnswer);
            //adds this answer to userAnswers List

            System.out.println(userAnswers);
            //outputs answers you've entered so far
        }

        //Checks if the user answers are equal to the correct answers
        for (int count = 0; count < answers.length; count++){
            if (userAnswers.get(count).equals(answers[count])){
                //compares the Array and list to see if the answers match
                System.out.println("Correct!");
                //if they do print correct

                score++;
            }
            else {
                System.out.println("Incorrect!");
                //if not incorrect
            }

        }

        System.out.println("You got " + score + " out of 5!");

    }
}
