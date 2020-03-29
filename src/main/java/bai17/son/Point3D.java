package bai17.son;

import bai17.dad.Point2D;

public class Point3D extends Point2D {
    private float z;

    public Point3D(float x,float y,float z){
        super(x,y);
        this.z=z;
    }
    public Point3D(){
        this.z=0.0f;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x,float y,float z){
        this.getX();
        this.getY();
        this.getZ();
    }
    public float[] getXYZ(){
        float[] array=new float[3];
        array[0]=this.getX();
        array[1]=this.getY();
        array[2]=this.getZ();
        return array;
    }
    public String toString(){
        return "("+super.toString()+z+")";
    }
}
