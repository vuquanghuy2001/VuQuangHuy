package bai19;

public class Triangle extends Shape {
    private int base,height;
    public Triangle(String color,int base,int height){
        super(color);
        this.base=base;
        this.height=height;
    }
    @Override
    public double getArea(){
        return 0.5*height*base;
    }
    @Override
    public String toString(){
        return "Rectangle[height="+height+",base="+base+"]";
    }
}
