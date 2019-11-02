/*
-> A variable-length argument is specified by three periods(…) 
-> A method that takes a variable number of arguments is a varargs method. It simplifies the creation of methods that need to take a variable number of arguments. 
-> This syntax tells the compiler that fun( ) can be called with zero or more arguments.
*/


class VarArgs{
	// A method that takes variable number of long 
    static void myVarArgMethod(long ...a) 
    { 
        System.out.println("Number of arguments: " + a.length); 
  
        // using for each loop to display contents of a 
        for (long i: a) 
            System.out.print(i + "," ); 
        System.out.println(); 
    } 

	public static void main(String[] args) {
		myVarArgMethod(1);
		myVarArgMethod(3, 100, 2);
		myVarArgMethod();
	}
}



