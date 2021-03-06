package bai17.dad;

public class Point {
    private float x;
    private float y;

    public Point(float x,float y){
        this.x=x;
        this.y=y;
    }
    public Point(){
        this.x=0.0f;
        this.y=0.0f;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x,float y){
        this.x=x;
        this.y=y;
    }
    public float[] getXY(){
        float[] array=new float[2];
        array[0]=this.x;
        array[1]=this.y;
        return array;
    }
    public String toString(){
        return "("+x+","+y+")";
    }
}
