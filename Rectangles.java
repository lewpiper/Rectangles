import java.awt.Rectangle;

/**
* CSCI 114 online, Week 2 Rectangles homework
* @author Lew Piper III
* @version 9/4/2016
*/

//Rectangles class
public class Rectangles
{
    public static void main(String[] args)
    {
        //Objects
        Rectangle rectangle1 = new Rectangle(0, 0, 10, 20);
        Rectangle rectangle2 = new Rectangle(5, 10, 20, 10);
        Rectangle anotherRectangle = new Rectangle(100, 200, 10, 10);

		//Intersecting Rectangles
		Rectangle r3 = rectangle1.intersection(rectangle2);
		Rectangle r4 = rectangle1.intersection(anotherRectangle);
		
		
		//Print to console
		System.out.println("rectangle1 is: " + rectangle1.toString());
		System.out.println("rectangle2 is: " + rectangle2.toString());
		System.out.println("r3 is: " + r3.toString());
		System.out.println("r4 is: " + r4.toString());
    }
}

