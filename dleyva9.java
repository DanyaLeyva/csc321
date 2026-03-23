import java.util.Scanner;
public class dleyva9{
       public static void main(String[] args){
            int number = 15; //between 10 and 20

            Scanner keyboard = new Scanner(System.in);

            System.out.println("Guess a number between 10 and 20: ");
            int guess = keyboard.nextInt();

            if(guess < number){
                    System.out.println("Your guess is LOWER than the number.");
                    System.out.println("YOU LOSE.");
             }else if (guess > number){
                     System.out.println("Your guess is HIGHER than the number.");
                     System.out.println("YOU LOSE.");
             }else {
                  System.out.println("You guessed the number.");
                  System.out.println("YOU WINN!!!");
             }
        }




}
