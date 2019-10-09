public class BreakAndContinue {



	public static void main(String[] args) {
	int[] myArray = {1,2,3,4};
		

		for(int i = 0; i < 3; i++){

			if (myArray[i]== 2){
				System.out.println("Shortcut to the top.");
				continue;
			} 
			if (myArray[i] == 3){
				System.out.println("Exit the loop");
				break;
			}
			System.out.println("Iterattion i = " + i );
		}
			System.out.println("BECAUSE WE HAVE A 'break' in the second if we exit the for loop and i = 2 never gets to be printed.");
	}
}