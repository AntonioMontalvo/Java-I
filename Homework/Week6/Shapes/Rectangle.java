public class Rectangle extends Polygon
{
    public int sideCount()
    {
        return 4;
    }

    public Rectangle(long length1, long length2, long length3, long length4)
    throws InstantiationException
    {
        //we call the Polygon constructor via super()
        super(length1, length2, length3, length4);
    }

    public static void main(String[] args)
    throws InstantiationException
    {
        //**CAUTION**FOR A RECTANGLE LENGTHS 1 & 2 ARE THE SAME AS 3 & 4
        Rectangle mySpecialSquare = new Rectangle(2, 4, 2, 4);

        System.out.println("The perimeter of the rectangle is " +  (int)mySpecialSquare.getPerimeter() + " units.");

        System.out.println("The area of the rectangle is " + mySpecialSquare.getArea() + " units.");
    }
}