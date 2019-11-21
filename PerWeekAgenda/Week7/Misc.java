/*
Packages; 
->
	create packege ->name it

	-> import is to get with dot notation a specific directory.

	like -> import edu.ucla.extention.javaI;
*/

import java.net.URL;
import java.Scanner;

try {

	FileInputStream fis = new FileInputStream ("src/whatver.text");

	URL uclaExtensuin = new URL("https://www.ucla.extention.edu");
	Scanner s = new Scanner(uclaExtensuin.openStream());

	while(s.hasNext()){
		String line = s.hasNextLine();

System.out.println(line);
	}
} catch 

//hastables are objects in javascript