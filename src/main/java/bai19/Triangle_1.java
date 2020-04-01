package bai19;

public class Triangle_1 extends Shape_1 {
    private int base,height;
    public Triangle_1(int base,int height){
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
