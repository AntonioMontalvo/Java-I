class Terrestrial extends Vehicle
{
    //Instance variables

    public int numOfWheels;

    //constructor # 1
    public Terrestrial(int numOfWheels)
    {
    	//notice how super calls the constructor of the Vehicle super class and passes 4 arguments. super() must be inside the class cconstructor as it is here inside the Terrestrial constructor.
    	 super(true, false, true, true);

        this.numOfWheels = numOfWheels;
        System.out.println(". This land vehicle has " +  this.numOfWheels+ " wheels.");
    }

    public Terrestrial(int numOfWheels, boolean passanger,boolean animal, boolean good, boolean  engine){
    	super(passanger, animal, good, engine);
    	this.numOfWheels = numOfWheels;
        System.out.println(". This land vehicle has " +  this.numOfWheels+ " wheels.");
    }

    //methods
    public void getYear()
    {
        System.out.println(super.year);
    }

    //
    public static void main(String[] args)
    {
    	Terrestrial myLandVehicle = new Terrestrial(4);
    }

}