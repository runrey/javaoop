package assign4;

public class TestCircle {
	public static void main(String args[]) {
		Circle2 c1 = new Circle2();
		Circle2 c2 = new Circle2(2);
		
		System.out.println(c1.getPerimeter());
		System.out.println(c1.getArea());
		
		System.out.println(c2.getPerimeter());
		System.out.println(c2.getArea());
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
	}
}
