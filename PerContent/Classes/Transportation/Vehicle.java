public class Vehicle
{
    //Instance variables
    protected boolean passanger = false;
    protected boolean animal = false;
    protected boolean good = false;
    protected boolean engine = false;

    protected  String people;
    protected  String animals;
    protected  String goods;
    protected  String motor;

    public int year = 2019;

    //constructors
    public Vehicle(boolean passanger,boolean  animal,boolean  good,boolean  engine){
        this.passanger = passanger;
        this.animal = animal;
        this.good = good;
        this.engine = engine;
        showWhatIsTrue();
        disPlayVehicleUsage();
    }    

    //methods
    void showWhatIsTrue(){
        if(passanger == true){
            this.people = "Transporting passangers. ";
        } else if (passanger == false){
            this.people = "It is not suitable for passangers. ";
        }
        if(animal == true){
            this.animals = "It transport animals. ";
        } else if (animal == false){
            this.animals = "It is not suitable for animals.";
        }
        if(good == true){
            this.goods = " It can transport goods. ";
        }  else if (good == false){
            this.goods = "Not good for transporting goods.";
        }
        if(engine == true){
            this.motor = " engine. ";
        } else if (engine == false){
            this.motor = " There is no engine in this vehicle.";
        }
    }

    void disPlayVehicleUsage(){
        System.out.printf("This vehicle is built for: %s %s %s", people, animals, goods);
        if(engine == true){
            System.out.print(" It has an "+ motor);
        }
    }
}


