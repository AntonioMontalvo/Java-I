import java.util.*;

public class hashTable{
	public static void main(String[] args) {

		// Creating a Hashtable
   		Hashtable<String, String> politicalMap = new Hashtable<String, String>();

		politicalMap.put("USA", "Washington, D.C.");
		politicalMap.put("UK", "London");
		politicalMap.put("Canada", "Ottawa");
		politicalMap.put("Brazil", "Rio de Janeiro");
		politicalMap.put("Brazil", "Brasilia");
		System.out.println(politicalMap.get("Brazil"));
	}
}