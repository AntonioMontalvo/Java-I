import java.util.Arrays;

public class ShallowVsDeepCopy {
	public static void main(String[] args) {
		//Let's create an empty array with room for 5 elements
		System.out.println("Our empty Array");
		int empty[] = new int[5];
		System.out.println(Arrays.toString(empty)); //verify is empty. Prints [0, 0, 0, 0, 0]
		System.out.println("");

		//Lets initialize an array 
		System.out.println("Our inititalized Array");
		int inititalized[] = {1,2,3,4,5}; 
		System.out.println(Arrays.toString(inititalized));//verify our array
		System.out.println("");

		//****SHALLOW COPY****//
		System.out.println("SHALLOW COPY");
		//if we assign intialize to empty both arrays will be pointing to the same place in memory
		empty = inititalized; //this is a shallow copy. empty points to initialized

		System.out.println("I am inititalized");
		System.out.println(Arrays.toString(inititalized));
		System.out.println("...and I am empty");
		System.out.println(Arrays.toString(empty));
		System.out.println("");
		System.out.println("If we change something in empty, initialized will be changed as well");
		System.out.println("");

		empty[3] = 5;//here initialized changes two

		System.out.println("See, we both look the same now");
		System.out.println("I am inititalized");
		System.out.println(Arrays.toString(inititalized));
		System.out.println("...and I am empty");
		System.out.println(Arrays.toString(empty));
		System.out.println("");
		System.out.println(Arrays.toString(inititalized));
		System.out.println(Arrays.toString(empty));
		System.out.println("");
		

		//****DEEP COPY****//
		//A deep copy requires copying each value
		int empty2[] = new int[5];
		int inititalized2[] = {6,7,8,9,10}; 

		System.out.println("DEEP COPY");
		for (int i = 0; i < inititalized2.length ; i++ ) {
			empty2[i] = inititalized2[i];
		}
		System.out.println("");
		System.out.println("Now we look the same but point to a different place in memory");
		System.out.println(Arrays.toString(inititalized2));
		System.out.println(Arrays.toString(empty2));
		System.out.println("");
		System.out.println("And if we make a change to empty, inititalized is not affected");
		empty2[3] = 5;//initialized doesn't change


		System.out.println("");
		System.out.println("I am inititalized");
		System.out.println(Arrays.toString(inititalized2));
		System.out.println("...and I am empty");
		System.out.println(Arrays.toString(empty2));
	}
}