import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args) {

//	    Prompt user to input their guess
        System.out.println("What is the number?");

//	    Collect user input
        Scanner reader = new Scanner(System.in); // creates a Scanner object
        String myGuess = reader.nextLine();

//	    if the answer is 3, print ‘Correct!’
//	    otherwise print  ’Try again!’
        if (myGuess.equals("2")) {
            System.out.println("Correct!");
        } else {
            System.out.println("Try again!");
        }


//      To indicate whether the entry is too high, print 'too high!'
//      otherwise, print 'Too high' or 'You won!'

       if (myGuess.equals("1")){
            System.out.println("Your guess is too low");
        } else if (myGuess.equals("2")){
            System.out.println("You've won!");
        } else {
            System.out.println("Your guess is too high");
        }


    }
}
















