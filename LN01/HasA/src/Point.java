/**
 * BIL343 Object Oriented Programming w/Java
 * Point.java | Assoc. Prof. Mustafa Sert | Dept. of Comp. Engr., Baskent University
 * Demonstrates type classes
 * 2022 Summer
 */
public class Point {
	private int x, y;	
	
	public Point() {
		this.x = 0;
		this.y = 0;
	}
	
	public Point(int x, int y) {//parameter constructor
		this.x = x;
		this.y = y;
	}	
	public String toString() {
		return "Point("+x+", " + y + ")";
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}	
	protected void finalize() {// For garbage collector house keeping
		System.out.println("Point class finalizer called..");
	}
}
