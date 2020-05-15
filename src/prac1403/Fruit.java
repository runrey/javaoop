package prac1403;

import java.util.Scanner;

public class Fruit{
	public static void main(String args[]) {
		try (Scanner in = new Scanner (System.in)) {
			String name = in.next();
			double price = in.nextDouble();
			String color = in.next();
			FruitDetails s = new FruitDetails(name, price, color);
			System.out.println(s.getName());
			System.out.println(s.getPrice());
			System.out.println(s.getColor());
			s.setColor("yellow");
			s.setName("banana");
			s.setPrice(143.0);
			System.out.println(s.getName());
			System.out.println(s.getPrice());
			System.out.println(s.getColor());
		}
		
	}
}