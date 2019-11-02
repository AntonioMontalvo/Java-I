public class Triangle extends Polygon
{

    public int sideCount()
    {
        return 3;
    }

    public Triangle(long length1, long length2, long length3)
    throws InstantiationException
    {
        //call the Polygon constructor via super()
        super(length1, length2, length3);
    }

    public static void main(String[] args)
    throws InstantiationException
    {
        Triangle myTriangle = new Triangle(5, 5, 5);

        System.out.println("The perimeter of the triangle is " +  (int)myTriangle.getPerimeter() + " units.");

        System.out.println("The area of the triangle is " + myTriangle.getArea() + " units.");
    }
}