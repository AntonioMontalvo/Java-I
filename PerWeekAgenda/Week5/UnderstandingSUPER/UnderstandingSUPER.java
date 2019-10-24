//The keyword extends is use to access to the parent class

public class UnderstandingSUPER extends SuperClass
{
//now we can access instance variables of the parent class with the keyword super. But first we must assign it to a method for usage.


	//IF A CONSTRUCTOR EXISTS IN THE PARENT CLASS THIS CLASS WILL CALL THE CONSTRUCTOR IN THE PARENT CLASS. THAT IS WHY "Hi my name is Antonio is shown first."

	//Contructor
	public UnderstandingSUPER (){
		System.out.println("I am the constructor for the UnderstandingSUPER class.");
	}


    void printAge()
    {
        System.out.println("Antonio's age is  "+super.age);//here we grab age from the SuperClass class 
    }

    void displayFutureAge(){
    	System.out.println("Antonio's future age is "+ super.getAntoniosFutureAge(2029)); 
   	   }

    public static void main(String[] args)
    {
        UnderstandingSUPER ageGrabber = new UnderstandingSUPER();

        ageGrabber.printAge();

        ageGrabber.displayFutureAge();
    }
}