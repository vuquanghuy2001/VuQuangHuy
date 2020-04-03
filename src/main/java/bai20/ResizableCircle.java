package bai20;

public class ResizableCircle extends Circle_2 implements Resizable {
    public ResizableCircle(double radius){
        super(radius);
    }

    @Override
    public String toString() {
        return "ResizableCircle{" +
                "radius=" + radius +
                '}';
    }

    @Override
    public void resize(int percent){
        this.radius=radius;
    }
}
