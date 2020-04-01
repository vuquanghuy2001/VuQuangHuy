package bai19;
 public class Rectangle_1 extends Shape_1{
    private double length;
    private double width;

    public Rectangle_1 (double length, double width){
        this.length=length;
        this.width=width;
    }
        @Override
    public double getArea(){
        return length*width;
    }
    @Override
    public String toString(){
        return "Rectangle[length="+length+",width="+width+"]";
    }
}
