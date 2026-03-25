import java.util.Scanner;
public class dleyva3{
	public static void main(String [] args){
		Scanner keyboard = new Scanner(System.in);

		int num;
		double dec;
		char letter;
		float smallDec;

		//Integer 
		System.out.println("Enter a integer number; ");
		num = keyboard.nextInt();

		//Double 
		System.out.println("Enter a decimal number: ");
		dec = keyboard.nextDouble();
		
		//letter
		System.out.println("Enter a letter: ");
		letter = keyboard.next().charAt(0);

		//small decimal number
		System.out.println("Enter a small decimal(float): ");
		smallDec = keyboard.nextFloat();

		
		//Integer Number
		if (num > 5){
			System.out.println("You entered "+ num +" which is larger than my number 5.");
		}else{
			System.out.println("You entered "+ num +" which is smaller than my number 5.");
		
		}


		//Double Number 
		if( dec < 87.9){
			System.out.println("You entered "+ dec +" which is smaller than my number 87.9");
		}else { 
			System.out.println("You enterd "+ dec +" which is larger than my number 87.9");
		}

		//Charchter
		if (letter != 'd'){
			System.out.println("You entered "+ letter +" which is not my letter 'd'");
		}else {
			System.out.println("you entered the letter 'd'");
		}

		//Float
		if (smallDec == 1.1f){
			System.out.println("You entered "+ smallDec +" which equals my number 1.1");
		}else{
			System.out.println("You entered "+ smallDec +" which is not equal to my number 1.1");
		}

		//for loop 3 times 
		for( int i =0; i < 3; i++){
			System.out.println("How do you make a tissue dance? Put a little boogie in it");
		}

		//for loop 4 times 
		int count = 0;
		while (count < 4 ){
			System.out.println("Enternal Sunshine of a spotless mind!!");
                        count++;	

		}

		keyboard.close();
	}
}
