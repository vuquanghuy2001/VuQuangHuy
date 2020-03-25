package bai14;

public class Circle {
	private Point center;
	private double radius;
	
	public Circle() {
		this.center = new Point();
		this.radius = 1.0;
	}
	public Circle(int xCenter, int yCenter, double radius) {
		center = new Point(xCenter, yCenter);
		this.radius = radius;
	}
	public Circle(Point center, double radius) {
		this.center = center;
		this.radius = radius;
	}
	public double getRadius() {
		return this.radius;
	}
	public void setRadius(double radius) {
		this.center = center;
	}
	public void setCenter(Point center) {
		this.center = center;
	}
	public int getCenterX() {
		return center.getX();
	}
	public void setCenterX(int x) {
		center.setX(x);
	}
	public int getCenterY() {
		return center.getY();
	}
	public void setCenterY(int y) {
		center.setY(y);
	}
	public int[] getCenterXY() {
		return center.getXY();
	}
	public void setCenterXY(int x, int y) {
		center.setXY(x, y);
	}
	public String toString() {
		return "Circl [ center = "+center+",radius ="+radius +"]";
	}
	public double getAre() {
		return Math.PI*radius*radius;
	}
	public double getCircumference() {
		return 2.0*Math.PI*radius;
	}
	public double distance(Circle another) {
		return center.distance(another.center);
	}
}
