package bai19;

abstract public class Shape_1 {
    private String color;
    public  Shape_1(){
        this.color ="red";
    }
    public Shape_1(String color){
        this.color=color;
    }
    @Override
    public String toString(){
        return "Shape[color="+color+"]";
    }
    abstract public double getArea();
}
