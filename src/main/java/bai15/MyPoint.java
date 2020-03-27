package bai15;

public class MyPoint {
    private int x;
    private int y;

    public MyPoint(){
        this.x=0;
        this.y=0;
    }

    public MyPoint(int x,int y){
        this.x=x;
        this.y=y;
    }

    public int getX(){
        return x;
    }
    public void setX(int x){
        this.x=x;
    }
    public int getY(){
        return y;
    }
    public void setY(int y){
        this.y=y;
    }
    public int[] getXY(){
        int[] MyArray=new int[2];
        MyArray[0]=this.x;
        MyArray[1]=this.y;
        return MyArray;
    }
    public void setXY(int x,int y){
        this.x=x;
        this.y=y;
    }
    public String String(){
        return "("+this.x+","+this.y+")";
    }
    public double distance(int x,int y){
        int xDiff = this.x -x;
        int yDiff = this.y -y;
        return Math.sqrt(xDiff*yDiff+yDiff*yDiff);
    }
    public double distance(MyPoint another){
        int xDiff = this.x - x;
        int yDiff = this.y - y;
        return Math.sqrt(xDiff*xDiff+yDiff*yDiff);
    }
    public double distance(){
        return Math.sqrt(this.x*this.x +this.y*this.y);
    }
}
