package assign4;

public class Rectangle extends Shape{
	protected double width;
	protected double length;
	
	public Rectangle() {
		this.setLength(1.0);
		this.setWidth(1.0);
	}
	
	public Rectangle(double l, double w) {
		this.setLength(l);
		this.setWidth(w);
	}
	
	public Rectangle(double l, double w, String col, boolean fill) {
		this.setLength(l);
		this.setWidth(w);
		this.setColor(col);
		this.setFilled(fill);
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}
	
	@Override
	public double getArea() {
		return length * width;
	}
	
	@Override
	public double getPerimeter() {
		return 2 * (length + width);
	}
	
	@Override
	public String toString() {
		String str = "A Rectangle with width=" + this.getWidth() + " and length=" + this.getLength() + ", which is a subclass of " + super.toString();
		return str;
	}

	
}