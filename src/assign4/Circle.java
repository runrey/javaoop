package assign4;

public class Circle extends Shape{
	
	protected double radius;
	
	public Circle() {
		this.setRadius(1.0);
	}
	
	public Circle(double rd) {
		this.setRadius(rd);
	}
	
	public Circle(double rd, String col, boolean fill) {
		this.setRadius(rd);
		this.setColor(col);
		this.setFilled(fill);
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	@Override
	public double getArea() {
		return 3.14 * radius * radius;
	}
	
	@Override
	public double getPerimeter() {
		return 2 * 3.14 * radius;
	}
	
	@Override
	public String toString() {
		String str = "A Circle with radius=" + this.getRadius() + ", which is a subclass of " + super.toString();
		return str;
	}
}
