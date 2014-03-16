import java.util.*;

public class Guessing
{
    public static void main(String[] args){
        Random rand = new Random();
        Scanner in = new Scanner(System.in);
        boolean play = true;
        while(play){
            int num = rand.nextInt(100)+1;
            System.out.print("I'm thinking of a number. Try to guess it! ");
            int guess = -1;
            boolean enter = false;
            while(!enter){
                try{
                    guess=Integer.parseInt(in.nextLine());
                    enter = true;
                }
                catch(Exception e){
                    System.out.print("    Input was not a number, try again: ");
                }
            }
            while(guess!=num){
                if(guess<num){
                    System.out.print("Too low! Guess again: ");
                }
                else{
                    System.out.print("Too high! Guess again: ");
                }
                enter = false;
                while(!enter){
                    try{
                        guess=Integer.parseInt(in.nextLine());
                        enter = true;
                    }
                    catch(Exception e){
                        System.out.print("    Input was not a number, try again: ");
                    }
                }
            }
            System.out.println("Correct! The number was " + num + "!");
            System.out.print("Do you wish to play again? (y/n): ");
            if(in.nextLine().equals("n")){
                play=false;
            }
        }
        System.out.println("Thank you for playing.");
    }
}