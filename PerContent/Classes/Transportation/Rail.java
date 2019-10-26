public class Rail extends Terrestrial{
	//Instance variables
	public int wagons;
	public int decks;


	//constructor
	public Rail(int wagons, int decks){
		//notice the super() call to the Terrestrial contructor
		super(104, true, true, true, true);
		

		System.out.println("This train has "+ wagons + " wagons and " + decks + " decks.");

	}	

	//no methods

	public static void main(String[] args) {
		//from the vehicle class
		Rail train = new Rail(22, 2);
	}
}