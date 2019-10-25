import java.util.*;


public class MyLinkedList{

    //INSTANCE VARIALBLES
    private String name;
    private MyLinkedList next;//this variable declaration refers to the object MyLinkedList, it is a reference to self.
    private LinkedList<String> myCitiesList;


    //CONSTRUCTOR
    public MyLinkedList(String name){
        this.name = name;
        myCitiesList = new LinkedList<String>();
        myCitiesList.add(name);
    }



    //-> add(String new_word): Adds a linkedlist item at the end of the linkedlist.
    public void add(String name){
        myCitiesList.add(name);
    }

    public void addToObject(String name){
        MyLinkedList i = this;//local variable. every instance method receives the implicit parameter in a variable called this.  Another variable of the type MyLinkedList that refer to self. However it will be use only when this method is used. After that is "destroyed?"
        while(i.next != null){
            i = i.next;
        }
        i.next = new MyLinkedList(name);// create a new instance with the added name
    }

    //->print(): Prints all the words inside of the linkedlist
    public void printAll(){
        for (String s : myCitiesList) {
            System.out.println(s);
        }
    }

    //->length(): Returns an int with the length of items in the linkedlist.
     public void  length(){
         System.out.println(myCitiesList.size());
     }

    //->itemAt(int index): returns LinkedList item at the index in the linkedlist.
    public void itemAt(int index){
        System.out.println(myCitiesList.get(index));
    }

    //->remove(int index): removes item at specified index
    public void remove(int index){
        myCitiesList.remove(index);
    }


    public static void main(String[] args){
        int count = 0;
        System.out.println("Create Object and initialize with first member:");
        MyLinkedList listLinked = new MyLinkedList("Juan Carlos");

        //add
        System.out.println("**********************************");
        System.out.println("New members added to the list.");
        listLinked.add("Antonio");
        listLinked.add("Hasan");
        listLinked.add("Marie");

        //showAll
        System.out.println("**********************************");
        System.out.println("The printAll method shows all members");
        listLinked.printAll();

        //show length()
        System.out.println("**********************************");
        System.out.println("Show number of elements");
        listLinked.length();

        //show itemAt index
        System.out.println("**********************************");
        System.out.println("Show the item at at specific index");
        listLinked.itemAt(2);

        //remove(int index):
        System.out.println("**********************************");
        System.out.println("Remove the element at the specified index and print all members");
        listLinked.remove(1);
        listLinked.printAll();
    }
}  