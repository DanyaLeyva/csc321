import java.util.Scanner;

public class dleyva4{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Menu");
		System.out.println("1. Motavation");
		System.out.println("2. Joke");
		System.out.println("3. Advice");
		System.out.println("4. Exit");
		System.out.println("Enter your choice : ");

		int choice = keyboard.nextInt();

		if (choice == 1){
			System.out.println("Keep pushing forward. You've got this.");
		}else if (choice == 2){
			System.out.println("Why did the chicken cross the road? to get to the other side");
		}else if (choice == 3){
		        System.out.println("Goodbye!");
		} else {
		System.out.println("Invalid choice.");
		}

		keyboard.close();

	}
}

