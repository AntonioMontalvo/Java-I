public class Car extends Terrestrial  {
	//Instance variables
	public int doors;
	public String type ;
	public  String color;


	//constructor
	public Car(String color, int doors,String 
		type ){
		//notice the super() call to the Terrestrial contructor
		super(6);

		this.color = color;
		this.doors = doors;
		this.type = type;
		//the constructor uses the method show car below
		showCar(color, doors, type);
	}
 
	//methods
	void showCar(String color, int doors,String type){

		System.out.println("This "+ type + " Car has " + doors + " doors" + " and it is " + color);
	}
	//this method calls for super.year which is defined in the Vehicle class. We get access to it through the Terrestrial class which extends Vehicle. So it is a daisy chain, because this  Car class is the grandson/daughter of the Vehicle class.
	void displayYearBuilt(){
		System.out.println("This Terrestrial Vehicle was built in " + super.year+ ".");
	}

	//We run our application from here
	public static void main(String[] args) {
		//from the Car class
		Car myCar = new Car("red", 4, "sport");
		myCar.displayYearBuilt();
	}
}