package assign3;

import java.util.Scanner;

public class Validator{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		Shape p = new Shape();
		if(p.isFilled())
			System.out.println(p.getColor());
		else 
			System.out.println("Not filled");
	
		
		Shape s = new Shape("red", true);	
		String col = in.next();
		s.setColor(col);
		if(s.isFilled())
			System.out.println(s.getColor());
		else 
			System.out.println("Not filled");
		
		s.setFilled(false);
		if(s.isFilled())
			System.out.println(s.getColor());
		else 
			System.out.println("Not filled");
		
		
		Square ss = new Square();
		System.out.println(ss.getArea());
		System.out.println(ss.getPerimeter());
		if(ss.isFilled())
			System.out.println(ss.getColor());
		else 
			System.out.println("Not filled");
		
		Square sq = new Square(2.0);
		System.out.println(sq.getArea());
		System.out.println(sq.toString()); //No need to override getArea() and getPerimeter() methods 
		
		Square squ = new Square(2.0, "blue", false);
		System.out.println(squ.getArea());
		System.out.println(squ.getPerimeter());
		System.out.println(squ.getColor());
		if(squ.isFilled())
			System.out.println(squ.getColor());
		else 
			System.out.println("Not filled");
		
		in.close();
	}
}