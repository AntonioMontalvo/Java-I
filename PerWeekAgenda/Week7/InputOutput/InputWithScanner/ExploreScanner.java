/*
-> Java defines two different I/O systems; one for bytes and one for characters.
-> Input and output is performed through streams. All streams present the same simple model to programs that use them: A stream is a sequence of data Streams a linked to a physical 
device by the Java I/O system.

-> The data source and data destination pictured above can be anything that holds, generates, or consumes data. Obviously this includes disk files, but a source or destination can also be another program, a peripheral device, a network socket, or an array.

-> When working with bytes there are two abstract classes that define how the subsequent concrete subclasses behave:
	-InputStream abstract class
	-OutputStream abstract class 

-> However because the java.lang.package is automatically imported to all programs, the package contains the System class that predefine 3 default stream variables.
 
	-System.in -> This in an object of the InputStream  class
	-System.out -> This in an object of the PrintStream abstract class
	-System.err -> This in an object of the PrintStream abstract class
	
*/

//The Scanner class is part of the java.util package
import java.util.*;
import java.io.*;

//A Scanner breaks its input into TOKENS using a delimiter pattern, which by default matches whitespace. The resulting TOKENS may then be converted into values of different types using the various next methods.

class ExploreScanner {
	public static void main(String[] args) throws IOException {
		//You can "create/open" the scanner to capture input, [parse primitive types]. After its been used it must be closed.

		//READING A LITERAL STRING
		String armstrong = "One small step for men "; 
		String armstrong2 = " ... , one giant leap for mankind!";
		 
		Scanner reader = new Scanner(armstrong); //open a scanner and pass the literal string armstrong

		//->Important!! Every time we use Scanner with a method that retrieves a token value, Scanner will "consume" the literal, so once its read, that is it. Cannot read it again.

		//CASE 1. READ ONE TOKEN AT A TIME WITH next(); 
		System.out.println(reader.next());//<- first token 
		System.out.println(reader.next());//<- second token

		//let's get all remaining token in armstrong. hasNext() returns true or false if reader can find more tokens
		//to go through

		while(reader.hasNext()){
			System.out.print(reader.next() + " ");			
		}

		//-> Let's prove Scanner has consumed al tokens in armstrong
		System.out.println("");
		System.out.println("Any more tokens in armstrong?  " + reader.hasNext());
		reader.close(); //<- Close Scanner


		//CASE 2. READ THE ENTIRE STRING WITH nextLine()
		Scanner reader2 = new Scanner(armstrong2); //open a scanner and pass the literal string armstrong2
		System.out.println(reader2.nextLine());
		reader2.close();

		//CASE 3. READ THE CONTENT OF A FILE IN THIS CASE LoremIpsum.txt in the parent folder
		Scanner fileReader = new Scanner(new File("../LoremIpsum.txt"));
		while(fileReader.hasNext()){
			System.out.print(fileReader.next() + " ");			
		}
		System.out.println("");
		System.out.println("");


		//SCAN USER INPUT WITH new Scanner(System.in); <- notice System.in wrapped in Scanner
		//-System.in -> This in an object of the InputStream  class
		Scanner scanner =  new Scanner(System.in);

		System.out.println("No that Scanner is listening to YOU! it is time to type something and show it back to you, I'm waiting, type and hit ENTER.");

		System.out.println("You just typed: " + scanner.nextLine());



		//
		Scanner scanner2 =  new Scanner(System.in);

		System.out.println("Type number and words: ");
			int num;


			System.out.print(scanner2.nextInt());
			if(scanner2.hasNextInt()){
				num	 = scanner2.nextInt();
				System.out.prinln(num + " ,");
			}
			
		
		 		
	}
}