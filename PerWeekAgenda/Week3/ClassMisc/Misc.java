enum Tier {
	ELITE, ADVANCE, BASIC
}

public class getTV()
{
	System.out.print()
}


public static void main(String[] args) {

Tier mytier = Tier.ELITE;
switch(mytier){
	case ELITE: f4();
	case ADVANCE: f3();
	default: 
	f2(); 
	f1();	
}


}


/////////////////////////////////////
//	do break continue example
//continue is a shortcut to go back to the begining of the loop
//break is to exit the loop



public class ArrayInClass{
	public static void main(String[] args) {
		int empty[] = new int[5];

		int inititalized[] = {1,2,3,4,5}; 
		empty =inititalized; //this is a shallow copy. empty points to initialized
		//empty[3] =5;//here initialized changes two
	
		//a deep copy requires copiying each value

		for (int x = 0; x < inititalized.length ; x++ ) {
			empty[x] = inititalized[x];
		}
	}
}

////////////////////
///String format
public class StringFormat{
	public static void main(String[] args) {
		String my_format = String.format("My name is %s and I am %d old", name, age);
		System.out.println(my_format);
	}
}