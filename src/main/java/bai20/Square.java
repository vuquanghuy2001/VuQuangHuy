package bai20;

public class Square extends Rectangle {

    public Square() {

    }

    public Square(double side) {
        super(side,side);
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side,side);
    }

    public double getSide() {
        return super.getWidth();
    }

    public void setSide(double side) {
        this.setSide(side);
    }

    public void setWidth(double side) {
        super.setWidth(side);
    }
    public void setLength(double side) {
        super.setLength(side);
    }
    @Override
    public String toString() {
        return "Square[" +  super.toString() + "]";
    }
}
