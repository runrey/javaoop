package assign4;

import java.util.Scanner;

public class Validator {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		Shape s1 = new Circle(5.5, "red", false); // Upcast Circle to Shape
		System.out.println(s1); // which version? Answer: version of Circle
		System.out.println(s1.getArea()); // which version? Answer: version of Circle
		System.out.println(s1.getPerimeter()); // which version? Answer: version of Circle
		System.out.println(s1.getColor());
		System.out.println(s1.isFilled());
	//	System.out.println(s1.getRadius()); is not working because Shape dont have getRadius func
		
		Circle c1 = (Circle)s1; // Downcast back to Circle
		System.out.println(c1);
		System.out.println(c1.getArea());
		System.out.println(c1.getPerimeter());
		System.out.println(c1.getColor());
		System.out.println(c1.isFilled());
		System.out.println(c1.getRadius());

		//Shape s2 = new Shape(); is not working because Shape is abstract class, abstract classes are never intend to create object
		
		Shape s3 = new Rectangle(1.0, 2.0, "red", false); // Upcast
		System.out.println(s3);
		System.out.println(s3.getArea());
		System.out.println(s3.getPerimeter());
		System.out.println(s3.getColor());
		//System.out.println(s3.getLength());  is not working because Shape dont have getLength func
		
		Rectangle r1 = (Rectangle)s3; // downcast
		System.out.println(r1);
		System.out.println(r1.getArea());
		System.out.println(r1.getColor());
		System.out.println(r1.getLength());
		
		Shape s4 = new Square(6.6); // Upcast
		System.out.println(s4);
		System.out.println(s4.getArea());
		System.out.println(s4.getColor());
		//System.out.println(s4.getSide()); is not working because Shape dont have getSide func
		
		// Take note that we downcast Shape s4 to Rectangle,
		// which is a superclass of Square, instead of Square
		Rectangle r2 = (Rectangle)s4;
		System.out.println(r2);
		System.out.println(r2.getArea());
		System.out.println(r2.getColor());
		//System.out.println(r2.getSide()); is not working because Rectangle dont have getSide func
		System.out.println(r2.getLength());
		
		// Downcast Rectangle r2 to Square
		Square sq1 = (Square)r2;
		System.out.println(sq1);
		System.out.println(sq1.getArea());
		System.out.println(sq1.getColor());
		System.out.println(sq1.getSide());
		System.out.println(sq1.getLength());
		
		//What is the usage of the abstract method and abstract class?
		// Abstract classes is needed to have common properties of subclasses but be never intended to create object of itself
		// Abstract methods is needed to use methods of subclass when we upcast them 
		in.close();
	}
}
