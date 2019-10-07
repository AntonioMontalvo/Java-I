import java.util.Scanner;

class DoWhile{
//the syntax for this loop situates the while(true) condition at the end of the loop. As a consequence the statement in the block of code is always executed at least once, after that first time only if the condition is true the statemwnt is executed again.

	//A great example would be to ask the user to provide the correct pin to access 

	public static void main(String[] args)
		throws java.io.IOException {
		int secretCode = 1411;
		int userInput;
		Scanner in = new Scanner(System.in);
		do {
			System.out.print("To access your account type the write PIN : ");
			userInput = in.nextInt();

		} while(userInput != secretCode);
	}
}