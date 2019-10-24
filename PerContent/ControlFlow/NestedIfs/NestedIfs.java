import java.util.Scanner;
class NestedIfs{
	public static void main (String[] args)
	throws java.io.IOException {

		Scanner in = new Scanner(System.in);

		int answer = 5;

		System.out.println("I'm thinking of a number between 0 an 10.");
		System.out.print("Can you guess it?: ");
		int num = in.nextInt();

		if(num == answer){
			System.out.println("That is right!");
		} else {
			if( num > 10 || num < 0 ){
				System.out.println("Remember, this game accept values from 0 to 10 only...");
			} 
			if ( num != answer ){
				if( num < 5){
					System.out.println("The number is to low.");
				} else {
					System.out.println("The number is too high.");
				}
			}
		}
		System.out.println("Run this file to play again.");
	}
}