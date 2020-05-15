package assign4;

public abstract class Shape {
	protected String color;
	protected boolean filled;
	
	public Shape() {
		this.setColor("red");
		this.setFilled(true);
	}
	
	public Shape(String col, boolean fill) {
		this.setColor(col);
		this.setFilled(fill);
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	public String toString() {
		String str = "A Shape with color of " + this.getColor() + " and ";
		if(this.isFilled()) {
			str+="filled.";
		}
		else {
			str+="Not filled.";
		}
		return str;
	}
	
	public abstract double getArea();
	public abstract double getPerimeter();
	
}
