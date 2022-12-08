package Projects.Movie;

import java.util.*;

public class GuessNameOfMovie {

        /*TASK:

        "JOKER", "INCEPTION", "PIYANIST", "GREENMILE", "LEON", "GODFATHER", "JURASSICPARK", "TITANIC"
       select any of the movies in the movie list above according to the index number of the movie without seeing the movie name .
       Create a method that allows you to guess the name of the selected movie and decide how many times user can guess ...

       Here's the TRICK...
       Print the number  of letters of selected movie by the user to the console.
       Print how many times the user can guess
       Print the number of remaining rights  to the console.
       Print the number of correct and incorrect predictions to the console for each guess of the user.
       Print the name of the movie when the user has lost or won

       */

        static Scanner scan = new Scanner(System.in);
        static List<String> list = new ArrayList<>(Arrays.asList("JOKER", "INCEPTION", "PIYANIST", "GREENMILE", "LEON", "GODFATHER", "JURASSICPARK", "TITANIC"));
        static int guessRights =0;
        static int numberOfGuesses=0;

    public static void main(String[] args) {


        letsPlayAGame();

    }

    private static void letsPlayAGame() {

        //1) user shuld enter a number to choose the movie
        System.out.println("please enter a value between 1-8");
        int index = scan.nextInt()-1;


    }
}
