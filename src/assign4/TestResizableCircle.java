package assign4;

public abstract class TestResizableCircle {
	
	public static void main(String args[]) {
		ResizableCircle c1 = new ResizableCircle(2);
		
		System.out.println(c1.getPerimeter());
		System.out.println(c1.getArea());
		
		c1.resize(100);
		
		System.out.println(c1.getPerimeter());
		System.out.println(c1.getArea());
		System.out.println(c1.toString());
	}
}
