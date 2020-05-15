package assign4;

interface GeometricObject{
	public double getPerimeter();
	public double getArea();
}

interface Resizable{
	public void resize(int percent);
}
class Circle2 implements GeometricObject{
	protected double radius;
	
	Circle2(){
		this.radius = 1.0;
	}
	
	Circle2(double r){
		this.radius = r;
	}
	
	@Override
	public double getPerimeter() {
		return 2*3.14*radius;
	}
	@Override
	public double getArea() {
		return 3.14*radius*radius;
	}
	
	public String toString() {
		return "subtask3 circle";
	}

}

class ResizableCircle extends Circle2 implements Resizable{
	
	ResizableCircle(double r){
		super(r);
	}
	
	public void resize(int p) {
		radius = radius * ((100.0 + p)/100.0);
	}
	
	@Override
	public String toString() {
		return "sub3 circle which changes its size";
	}
}