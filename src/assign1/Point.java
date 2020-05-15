package assign1;

import static java.lang.Math.sqrt;

public class Point{
	private double x = 0;
	private double y = 0;
	Point(double a, double b){
		x = a;
		y = b;
	}
	
	public double distance(Point a) {
		double x1 = a.x;
		double y1 = a.y;
		return sqrt((x-x1)*(x-x1)+(y-y1)*(y-y1));
	}
	
	public void setX(double a) {
		x = a;
	}
	
	public void setY(double a) {
		y = a;
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
}