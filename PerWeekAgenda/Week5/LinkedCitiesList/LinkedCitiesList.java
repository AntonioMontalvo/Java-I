/*Add the following methods:

-> add(String new_word): Adds a linkedlist item at the end of the linkedlist
-> print(): Prints all the words inside of the linkedlist
-> length(): Returns an int with the length of items in the linkedlist
-> remove(int index): removes item at specified index
-> itemAt(int index): returns LinkedList item at the index in the linkedlist
*/



import java.util.*;  
public class LinkedCitiesList{  
 public static void main(String args[]){  
  
  LinkedList<String> myCitiesList=new LinkedList<String>();  
     myCitiesList.add("Los Angeles");  
     myCitiesList.add("Madrid");  
     myCitiesList.add("D.F.");  
     myCitiesList.add("Stockholm");
     myCitiesList.add("Taipei");
     myCitiesList.add("Beijing");
     myCitiesList.add("Istambul");  
  
  Iterator<String> citiesLooper = myCitiesList.iterator();  
  while(citiesLooper.hasNext()){  
   System.out.println(citiesLooper.next());  
  }  
 }  
}  
