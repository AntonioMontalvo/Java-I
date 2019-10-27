/*POLYMORPHISM: What is polymorphism in programming?

DEFINITION -> Polymorphism is the capability of a method to do different things based on the object that it is acting upon. 	In other words, polymorphism allows you define one interface and have multiple implementations.

TYPES OF POLYMORPHISM: Types of polymorphism in java- Runtime and Compile time polymorphism.

	*Compile time Polymorphism (or Static polymorphism)
		Polymorphism that is resolved during compiler time is known as static polymorphism. METHOD OVERLOADING is an example of compile time polymorphism.
		Method Overloading: This allows us to have more than one method having the same name, if the parameters of methods are different in number, sequence and data types of parameters.

	*Runtime Polymorphism (or Dynamic polymorphism)
		It is also known as Dynamic Method Dispatch. Dynamic polymorphism is a process in which a call to an overridden method is resolved at runtime. METHOD OVERRIDING is an example of runtime time polymorphism.
 */



class Overload//Method Overloading.Compile time Polymorphism.
{
    //Method Overloading is a feature that allows a class to have more than one method having the same name, if their argument lists are different. //NOTICE ALL METHODS HAVE THE SAME NAME.

    void demo (int a)//only 1 param. is an int
    {
        System.out.println ("a: " + a);
    }
    void demo (int a, int b)//two params
    {
        System.out.println ("a and b: " + a + "," + b);
    }
    double demo(double a)//one param but this time a double
    {
        System.out.println("double a: " + a);
        return a * a;
    }
}

class OverRiding { //Method OverRiding. Declaring a method in sub class which is already present in parent class is known as method overriding. Overriding is done so that a child class can give its own implementation to a method which is already provided by the parent class. In this case the method in parent class is called overridden method and the method in child class is called overriding method.

    public void sayName(){
        System.out.println("My Name is Antonio");
    }

}


class Polymorphism extends OverRiding{ //notice we are extending OverRiding as a parent class.
    
    public void sayName() { ////also notice we have a method in the Polymorphism class with the same name as the one in the parent class.
        System.out.println("As a child of OverRiding, I OverRide the sayName() method, so I don't say Antonio anymore.");
    }



    public static void main(String[] args)
    {
        System.out.println("Compile time Polymorphism -> METHOD OVERLOADING <-");

        //create OverLoad object and apply all forms
        Overload atCompilation = new Overload();
        atCompilation.demo(1);
        atCompilation.demo(2, 3);
        atCompilation.demo(100.3);

        //*************************
         System.out.println("");
         System.out.println("Runtime Polymorphism -> METHOD OVERRIDING <-");

         //Create OverRide object
        Polymorphism atRunTime = new Polymorphism();
        atRunTime.sayName();//I
    }
}