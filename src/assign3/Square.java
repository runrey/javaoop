package assign3;

public class Square extends Rectangle{
	
	public Square() {}
	
	public Square(double side) {
		this.setLength(side);
		this.setWidth(side);
	}
	
	public Square(double side, String col, boolean fill) {
		this.setLength(side);
		this.setWidth(side);
		this.setColor(col);
		this.setFilled(fill);
	}
	
	public double getSide() {
		return this.getLength();
	}
	
	public void setSide(double side) {
		this.length = side;
		this.width = side;
	}
	@Override
	public String toString() {
		String str = "A Square with side=" + this.getWidth() + ", which is a subclass of " + super.toString();
		return str;
	}
	
	@Override
	public void setLength(double side) {
		this.length = side;
		this.width = side;
	}
	
	@Override
	public void setWidth(double side) {
		this.length = side;
		this.width = side;
	}
	
	public static void main(String args[]){
		
	}
}