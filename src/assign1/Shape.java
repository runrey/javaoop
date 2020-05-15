package assign1;

import java.util.ArrayList;

public class Shape{
	private ArrayList<Point> points;
	
	public Shape() {
		points = new ArrayList<Point>();
	}
	
	public void addPoint(Point a) {
		points.add(a);
	}
	
	public void getPoints() {
		for(int i = 0; i<points.size(); i++) {
			Point a = points.get(i);
			System.out.println(a.getX()+", "+a.getY());
		}
	}
	
	public double calculatePerimeter() {
		double per = 0.0;
		if(points.size()>1) {
			for(int i = 0; i<points.size()-1; i++) {
				per += points.get(i).distance(points.get(i+1)); 
			}
			per += points.get(points.size()-1).distance(points.get(0));
		}
		
		return per;
	}
	
	public double longestSide() {
		double max = 0.0;
		double a;
		if(points.size()>1) {
			for(int i = 0; i<points.size()-1; i++) {
				a = points.get(i).distance(points.get(i+1)); 
				if(a > max) {
					max = a;
				}
			}
			a = points.get(points.size()-1).distance(points.get(0));
			if(a>max) {
				max = a;
			}
		}
		return max;
	}
	
	public double averageLength(){
		double total = calculatePerimeter();
		double avg = total/points.size();
		return avg;
	}
	
	
}