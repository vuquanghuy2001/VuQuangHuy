package bai17.dad;

import bai14.Point;

public class Point2D {
    private float x;
    private float y;

    public Point2D(float x,float y){
        this.x=x;
        this.y=y;
    }
    public Point2D(){
        this.x=0.0f;
        this.y=0.0f;
    }
    public float getX(){
        return x;
    }
    public void setX(float x){
        this.x=x;
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
        float[] myArray=new float[2];
        myArray[0]=this.x;
        myArray[1]=this.y;
        return myArray;
    }
    public String toString(){
        return "("+x+","+y+")";
    }
}
