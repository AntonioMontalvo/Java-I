/*
-> Abstract classes can have abstract methods(methods without body) as well as concrete methods (regular methods with body), while a normal class(non-abstract class) cannot have abstract methods.

-> An abstract class can not be instantiated, which means you are not allowed to create an object of it.

-> So, by making abstract methods in a parent class we force all the sub classes to implement this method( otherwise you will get compilation error), also we need not to give any implementation to this method in the parent class.

-> Since abstract class allows concrete methods as well, it does not provide 100% abstraction. You can say that it provides partial abstraction. Abstraction is a process where you show only relevant data and hide unnecessary details of an object from the user. Interfaces on the other hand are used for 100% abstraction.

->  An abstract class must be extended and in a same way abstract method must be overridden.

-> A class has to be declared abstract to have abstract methods.
 */

//LET'S CREATE AN ABSTRACT CLASS

abstract class School{//we declare all methods we need to create a school. Some will be abstract method(without body) and some will be concrete methods (with body)

	public String schoolName;
	public String location;

	//CONCRETE METHODS
	public void setName(String givenName){
		schoolName = givenName;
	}

	public void setSchoolLocation(String location){
		this.location = location;
	}

	public void displaySchool(){
		System.out.println(schoolName +" is located in " + location);
	}

	//ABSATRACT METHODS for School. This are the methods declare but NOT implemented in this class. Our School will need teachers and students so let's create abstract methods for them here. Remember any child class that extends this abstract class School will be force to implement this methods  or the compiler will complain about it.

	abstract void teacher(String name, int grade);

	abstract void student(String name, int grade);

	}


class MyLittleSchool extends School{
	//this is a regular class that extends School. In here I have to implement the teacher and student methods declared in the abstract class School. Obviously there are many teaches and student in a school but as a demo and for simplicity we'll have only one student and teacher in MyLittleSchool.

	private String teacher;
	private String student;

	//I MUST OVERRIDE THE ABSTRACT METHODS

	public void teacher(String name,int grade){
		this.teacher = name;
		System.out.println("My name is " + name + " . I'm a " + grade + " grade teacher at " + schoolName);
	}

	public void student(String name, int grade){
		System.out.println("My name is " + name + " . I'm a " + grade + " grade student in " + teacher + "'s class.");
	}


}

class AbstractClass extends MyLittleSchool { // this is just the name of this class but is NOT an Abstract class
	//constructor
	public  AbstractClass(){
			System.out.println("I'm the AbstractClass class and I do all of this...");
		}

	public static void main(String[] args) {

		//create object
		AbstractClass westWoodSchool = new AbstractClass();

		//See, I can use the concrete methods from the abstract class
		westWoodSchool.setName("My little Coding Camp.");
		westWoodSchool.setSchoolLocation("Westwood, Los Angeles");
		westWoodSchool.displaySchool();

		//And ... I can use the methods from the MyLittleSchool concrete class

		westWoodSchool.teacher("John", 1);
		westWoodSchool.student("J.C", 1);
	}
}