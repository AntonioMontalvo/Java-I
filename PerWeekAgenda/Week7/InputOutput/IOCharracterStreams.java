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

import java.io.*;
// import java.io.FileInputStream;
// import java.io.FileOutputStream;
// import java.io.IOException;
// import java.util.Scanner;

public class IOCharracterStreams {
	public static void main(String[] args) throws IOException {

		/*CONSOLE INPUT -> Since System.in is a byte stream we have to convert the stream into a character stream with 
		InputStreamReader which is a concrete class of the IO abstract Reader class and nthen wrap the InputStreamReader 
		"stream converter" in the BufferedReader concrete class, also from the Reader class.*/
		BufferedReader charactersFromConsole = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Type stuff!..observe..and to quit type *");//tell user what to do

		//then using a do while loop -> one character in
		char letter;
		do {
			letter = (char)charactersFromConsole.read();//we use read()
			System.out.println(letter); //-> one character out
		} while(letter != '*');


		//the same concept but this time reading a string of characters
		BufferedReader charactersFromConsole2 = new BufferedReader(new InputStreamReader(System.in));	

		System.out.println("Type stuff!..observe..and to quit type *");
		String stringFromConsole;
		do{
			stringFromConsole =  charactersFromConsole2.readLine();
			System.out.println(stringFromConsole);
		} while(!stringFromConsole.equals("quit"));	
		
		//READING A TEXT FILE -> Specifically the Lorem Ipsum text file in this same directory.
		/*
		The abstract class Reader has a concrete class BufferedReader that reads characters. We can wrap the the FileReader object from the InputStreamReader class  to read the content of file. 
		*/
		String fileContent;
		try(BufferedReader iReadFiles = new BufferedReader(new FileReader("LoremIpsum.txt"))){
			
			while ((fileContent = iReadFiles.readLine())  != null){
				System.out.println(fileContent);
			}
		}	

		catch (IOException err){
			System.out.println("Error " + err);
		}

		//WRITING TO A FILE WITH
		/*
		Use FileWriter to create a Writer to write to a file. As before we wrap InputStreamReader in a BufferedReader, adn then use file FileWriter
		*/
		String typedString;
		BufferedReader charactersFromConsole3 = new BufferedReader(new InputStreamReader(System.in));			
		System.out.println("Type to write to the file. When you are done type quit.");
		
		try (FileWriter myFile = new FileWriter("typedFromConsole.text")){
			do{
				typedString = charactersFromConsole3.readLine();
				if(typedString.compareTo("quit") == 0){
					break;
				}
				typedString = typedString + "\r\n";
				myFile.write(typedString);

			} while(typedString.compareTo("quit") != 0);
		} catch (IOException err) {
			System.out.println("I/O Error: " + err);
		}


		}
	}
