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


public class IOforByteStreams {

	public static void main(String[] args) throws IOException {
	

	//READ BYTES FROM KEYBOARD
	byte data[] = new byte[10];

	System.out.println("Type something");
	System.in.read(data);
	System.out.print("This is what you've typed -> ");

	for (int i = 0; i < data.length; i++){
		System.out.print((char)data[i]+ ",");
	}

	// WRITING TO CONSOLE
	/*
	-> From the abstrac OutputStream class, the concrete PrintStream derives, which has the print(), println(), prinft() 
	and format() methods. Normally tou use this methods to write to the console. 
	-> PrintStream also offers the write() that Writes the specified byte to this stream.
	*/

	int b = 'X'; // <= Notice the single quotes so it is a char literal.	
	
	System.out.write('\n');//new line
	System.out.write(b);
	System.out.close(); // close the stream

	}
}