public class Circle implements Shape
{	//instance variables
    public double radiusLength;
    public double diameter;
    public double circumference;
    public double pi =  Math.PI;
    public double area;

    //constructor
    public Circle(double radius)
    {
        this.radiusLength = radius;
        this.diameter = 2 * radius;

        System.out.println(this.radiusLength + " is radius " + this.diameter + " is the diameter.");
    }

    public double getCircumference()//instance method
    {
        this.circumference = pi * diameter;
        return circumference;
    }

    public double getArea()//instance method
    {
        // Area = PI * radius(square);
        double radiusPowerofTwo = Math.pow(this.radiusLength, 2.0);
        this.area = pi * radiusPowerofTwo;
        return area;
    }

    public static void main(String[] args)
    {
        Circle myCircle = new Circle(7);
        System.out.println("The circumference of our circle  is " + myCircle.getCircumference());
        System.out.println("The area of our circle  is " + myCircle.getArea());
    }


}
