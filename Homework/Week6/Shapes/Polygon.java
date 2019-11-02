/*
-> The Polygon abstract class is implementing the Shape interface, hence to compile the Polygon class we are forced to implement the getPerimeter() and getArea() methods whitin the Polygon class.

-> Also, the Polygon abstract class creates the sideCount() abstract method that must be implemented by another class.
*/
abstract class Polygon implements Shape
{
    public abstract int sideCount();  // Returns 3 for triangle, 4 for rectangle. The implementation of this method will be done by the Triangle and Rectangle classes.

    public long sides[];//instance variable

    //the Polygon constructor takes Varargs as an argument for variable number of longs
    public Polygon(long ...side_lengths)throws InstantiationException
    {
        //it thorws an exception if
        if(side_lengths.length > this.sideCount())
        {
            throw new InstantiationException();
        }
        //it assigns to sides the values given by the sideCount() method
        this.sides = new long [this.sideCount()];
        //when the Poligon constructor is called, it expects Varargs. The loop below takes each of the arguments in the Vararg ...side_length an assign it to the instance array variable sides[].
        for (int i = 0; i < side_lengths.length; i++)
        {
            this.sides[i] = side_lengths[i];
        }
        System.out.println("sideCount() returns " + sideCount());
    }

    public  double getPerimeter()//instance method
    {
        double perimeter = 0.0;

        for (int i = 0; i < sides.length; i++)
        {
            perimeter += sides[i];
        }
        return perimeter;
    }

    public double getArea()//instance method
    {
        double area = 0.0;
        //for the triangle
        if (sideCount() == 3)
        {
            //Heron's Formula for the area of a triangle.
            double halfPerimeter = this.getPerimeter() / 2;

            area = Math.sqrt( halfPerimeter * (halfPerimeter - this.sides[0]) * (halfPerimeter - this.sides[1]) * (halfPerimeter - this.sides[2]));
        }

        //for the rectangle
        if(sideCount() == 4)
        {
            area = this.sides[0] * this.sides[1];
        }
        return area;
    }
}


/*
POLYGON DEFINITION

A polygon is any 2-dimensional shape formed with straight lines. Triangles, quadrilaterals, pentagons, and hexagons are all examples of polygons. The name tells you how many sides the shape has.

PERIMETER

The distance around a polygon is called the perimeter. To find the perimeter of any polygon you add the lengths of its sides.
You can use the same method for finding the perimeter of an irregular polygon to find the perimeter of a regular polygon, but not the other way around.

 	1.Write down the length of each side of the polygon.
 	2.Add up all of the lengths to find the perimeter.

AREA

TRIANGLE'S AREA
Heron's Formula for the area of a triangle(Hero's Formula)
A method for calculating the area of a triangle when you know the lengths of all three sides.

	Let a,b,c be the lengths of the sides of a triangle. The area is given by:

	Area	=	 √	p (p−a) (p−b) (p−c)
	where p is half the perimeter, or   a+b+c/2

	RECTANGLE'S AREA
	To find the area of a rectangle, multiply the length by the width.

	The formula is:
	Area = L * W
	Where L is the length, W is the width, and * means multiply.


CIRCLE DEFINITION

-> A CIRCLE is a shape with all points the same distance from the center.

-> The CIRCUMFERENCE is the distance around a circle.

-> The DIAMETER is the distance across the circle through the center.

  "PI" is the ratio of the circumference of a circle to the diameter. Thus, for any circle, if you divide the circumference by the diameter, you get a value close to "PI". This relationship is expressed in the following formula:

	circumference / diameter = PI

 -> The RADIUS of a circle is the distance from the center of a circle to any point on the circle. The diameter of a circle is twice as long as the radius. This relationship is expressed in the following circumference of a circle formula:
 	diameter = radius * 2
 	circumference = PI * diameter



 -> The AREA of a circle is:

 	Area = PI * radius(square);
*/