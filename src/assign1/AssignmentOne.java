package assign1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AssignmentOne{
	public static void main(String args[]) throws FileNotFoundException{
		Shape a = new Shape();
		Scanner in = new Scanner (new File ("E:\\eclipse-workplace\\d\\src\\assign1\\file1.txt"));
		while(in.hasNextDouble()) {
			double x = in.nextDouble();
			double y = in.nextDouble();
			Point c = new Point(x,y);
			a.addPoint(c);
		}
		a.getPoints();
		System.out.println(a.calculatePerimeter());
		System.out.println(a.longestSide());
		System.out.println(a.averageLength());
	}
}