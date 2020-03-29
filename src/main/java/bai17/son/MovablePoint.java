package bai17.son;

import bai17.dad.Point;

public class MovablePoint extends Point {
    private float xSpeed;
    private float ySpeed;

    public MovablePoint(float x,float y,float xSpeed,float ySpeed){
        super(x,y);
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public MovablePoint(float xSpeed,float ySpeed){
        this.xSpeed=0.0f;
        this.ySpeed=0.0f;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed,float ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public float[] getSpeed(){
        float[] array=new float[2];
        array[0]=this.xSpeed;
        array[1]=this.ySpeed;
        return array;
    }
    public String toString(){
        return "("+super.getX()+","+super.getY()+"),speed=("+xSpeed+","+ySpeed+")";
    }
    public MovablePoint move(){
        this.xSpeed+=xSpeed;
        this.ySpeed=ySpeed;
        return this;
    }
}
