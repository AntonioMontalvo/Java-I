public class Air extends Vehicle {
	//Instance variables
	public int range;
	public int maxAltitud;

	//constructor
	public Air(int range, int maxAltitud){
		super(true, true, true, true);
		this.range = range;
		this.maxAltitud = maxAltitud;
		defineAircraft();
	}

	//methods

	public void defineAircraft(){
		System.out.println(". This aircraft has a range of " +  this.range + " miles, and it flyes at a maximum altitud of " + this.maxAltitud + " meters.");
	}

	public static void main(String[] args)
    {
    	Air myAircraft = new Air (4782, 12999);
    }

}
