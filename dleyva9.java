//Danya Leyva
//Lab-09

import java.util.Scanner;
import java.util.Random;

public class dleyva9{
       public static void main(String[] args)
       {
	    Random random = new Random();
	    Scanner keyboard = new Scanner(System.in);

	    //between 10 and 20
	    int answer = random.nextInt(20)+1; 					       
            int guess =0;
	    
	    
	    System.out.println("Guess a number between 1 and 20: ");
            guess = keyboard.nextInt();

            while( guess < 1 || guess > 20 )
	    {
		    System.out.print("Your input is an number out of range(1-20) re-enter a valid number");
		    guess = keyboard.nextInt();
	    }


            if ( guess == answer)
	    { 
		    for(int i = 0; i < guess; i++)
                    {
			    System.out.println("YOU WINN!!!");
                            System.out.println("You guessed the number correctly! "+ answer + ".");
                    }
	    }	
	    else
	    {
		    if(guess <  answer)
		    {
			    System.out.println("YOU LOSE.");
			    System.out.println("Your guess is LOWER than the number "+ answer + "." );
			    
		    }
		    else 
		    {
			    System.out.println("YOU LOSE.");
			    System.out.println("Your guess is HIGHER than the number "+ answer + ".");
		    }
	    }

	    keyboard.close();
        }

}
