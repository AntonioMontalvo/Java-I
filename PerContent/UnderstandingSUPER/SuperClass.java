
public class SuperClass{
	 int age = 47;
	 String name = "Antonio"; 

	 //Constructor
	 public SuperClass (){
	 	System.out.println("I am the constructor for the SuperClass class." + name);
	 	System.out.println("Hi my name is " + name);
	 }

	 public static int getAntoniosFutureAge(int futureYear){
	 	return futureYear-2019+ 47;
	 }
}