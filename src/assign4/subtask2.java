package assign4;

interface Movable{
	public void moveUp();
	public void moveDown();
	public void moveLeft();
	public void moveRight();
}

class MovablePoint implements Movable{
	public int x;
	public int y;
	public int xSpeed;
	public int ySpeed;
	
	MovablePoint(int x, int y, int xs, int ys) {
		this.x = x;
		this.y = y;
		this.xSpeed = xs;
		this.ySpeed = ys;
	}
	@Override
	public void moveUp() {
		y+=ySpeed;
	}
	@Override
	public void moveDown() {
		y-=ySpeed;
	}
	@Override
	public void moveLeft() {
		x-=xSpeed;
	}
	@Override
	public void moveRight() {
		x+=xSpeed;
	}
	
	public String toString() {
		return "Bla-Bla-Bla point is moving";
	}
}

class MovableCircle implements Movable{
	public int radius;
	public MovablePoint center;
	
	MovableCircle(int x, int y, int xs, int ys, int r){
		center.x = x;
		center.y = y;
		center.xSpeed = xs;
		center.ySpeed = ys;
		this.radius = r;
	}
	@Override
	public void moveUp() {
		center.moveUp();
	}
	@Override
	public void moveDown() {
		center.moveDown();
	}
	@Override
	public void moveLeft() {
		center.moveLeft();
	}
	@Override
	public void moveRight() {
		center.moveRight();
	}
	
	public String toString() {
		return "Bla-Bla-Bla circle is moving";
	}
}
