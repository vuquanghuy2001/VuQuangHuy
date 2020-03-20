package bai3;

public class ex10_6 {
    public static void main(String[] args) {
        int[][] grid=new int[12][8];
        int numrows=grid.length;
        int numCols=grid[0].length;

        for (int row=0;row<numrows;++row){
            for (int col=0;col<numCols;++col){
                grid[row][col]=row*numCols+col+1;
            }
        }
        for (int row=0;row<numrows;++row){
            for (int col=0;col<numCols;++col){
                System.out.printf("%3d",grid[row][col]);
            }
            System.out.println();
        }
    }
}
