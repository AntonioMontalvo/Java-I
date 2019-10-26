////////////////////////////////////////////////
//NOTE THIS FILE IS INTENDED FOR LEARNING ONLY//
//IT WILL NEVER RUN. YOU CAN USE THE VEHICLE CLASS FOR THIS//

/*
The class is the essence of Java. In short the class defines the nature of the object. Its a template, a blue print, a logical abstraction. Java uses a class specification to construct objects. It is not until the object of the  class has been created that the physical represensation of the class exists in memory. Each object is an instance of the class. 

Keep in mind that a class encapsulates functionality, representing the building blocks of a larger application. Thus the class must be as small as possible and with a single functionality.
*/

//A class is defined using the keyword 'class' followed by the name of the class.

// -> A CLASS DEFINITION CREATES A NEW DATA TYPE <- //

class ClassFundamentals{
	//The class encapsulates both variables and methods called members of the class. The data members are also referred as instance variables. 


	//DATA STORAGE SECTION//

	//Instance variables or data members store information. A point here, a well-designed class, groups logically connected information.

	//Keep in mind a public instance variable...
	public String member1 = "The data store here is accessible to the members of the class and its subclasses. Also to the packages in which the class may be and to the world.";

	//A protected instance variable...
	protected String member2 = "Is accessible to all of the above but the world.";

	//A private instance variable...
	private String member3 = "Is accessible only by the class.";

	private int member4 = 1;

	private boolean member5 = true;

	private int member6;

	private String member7;

	private char[] member8;

	//THE CONSTRUCTOR//

	//A constructor initializes an object when it is created. It has the same name as its class and is syntactically similar to a method; however, contructors have NO explicit return type. Typically you  will use it ti give initial values to the instance variables defined in the class. Constructors may accept arguments as parameters. A constructor is called with the keyword new.

	//IT IS POSSIBLE TO HAVE MORE THAN CONSTRUCTOR IN EACH CLASS. THE PARAMETERS FOR EACH CONSTRUCTOR WILL 'activate' THE PARTICULAR CONSTRUCTOR.

	public ClassFundamentals (int member6, String member7, char[] member8 ){
		this.member6 = member6;// this.member6 refers to the instance variable defined in the class above, while member6 refers to the parameter variable defined in the constructor. Thus here we effectively assign the value given to the constructor at the time of object creation to the instance variable of the class, initializing the object to this value.
		this.member7 = member7;
		this.member8 = member8;
	}
	public ClassFundamentals (){
		member6 = 10;
		member7 = "Literal values.";
	}

	//METHODS SECTION//

	//Methods are subroutines that manipulate the data defined by the class and in many cases provide access to the data. In well written Java code, methods perform only one task.

	//Returning from a method happens either because the closing curly brace is encountered or because a return statement is executed. They are two forms of return. 
	//Void methods cause the immediate termination of a method for those methods that don't return a value

	void iDontReturnValues(){
		System.out.println("A void method does not return values.");
	}

	//Or, like most methods returning a value. The return type of a method is important because the type of the data returned must be compatible with the return type specified by a method. 

	public int iReturnAnumber(int number){
		return number + 1;
	}



	/*THE main() method is reserved for the method that begins the execution of the program.

		public static void main(String[] args) {	
		}

	you can use this main() method within the class or use main() in another class to call this class. In that case the only thing to remember is that both files, that is the file that that calls the class and the class file must be on the same directory or imported literally.*/
} 



