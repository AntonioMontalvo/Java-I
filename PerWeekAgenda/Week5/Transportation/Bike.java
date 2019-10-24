public class Bike extends Terrestrial{
	//Intance variables
	public String type;
	public  String color;

	//constructor
	public Bike(String type, String color){
		//notice the super() call to the Terrestrial contructor
		super(2, true, false, false, true);
		this.color = color;
		this.type = type;

		System.out.println(type + " it is  " + color + " color.");
	}

	//method 
	void displayYearBuilt(){
		System.out.println("This Terrestrial Vehicle was built in " + super.year+ ".");
	}
	public static void main(String[] args) {
		//from the vehicle class
		Bike myBike = new Bike("This bike is a cruiser bike.", "Red" );

		myBike.displayYearBuilt();
	}
}