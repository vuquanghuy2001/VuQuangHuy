package bai18.dad;

public class Shape {
    private String color;
    public Shape (String color){
        this.color=color;
    }
    @Override
    public String toString(){
        return "Shape[color="+color+"]";
    }
    public double getArea(){
        System.err.println("Shape unknown! Cannot computer area!");
        return 0;
    }
}
