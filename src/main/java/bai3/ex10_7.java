package bai3;

public class ex10_7 {
    public static void main(String[] args) {
        int [][] grid={
                {1,2},
                {3,4,5},
                {6,7,8,9}
        };
        for (int y=0;y<grid.length;++y){
            for (int x=0;x<grid[y].length;++x){
                System.out.printf("%2d",grid[y][x]);
            }
            System.out.println();
        }
        int [][] gird1=new  int[3][];
        gird1[0]=new int[2];
        gird1[1]=new int[3];
        gird1[2]=new int[4];

        for (int y=0;y<gird1.length;++y){
            for (int x=0;x<gird1[y].length;++x){
                System.out.printf("%2d",gird1[y][x]);
            }
            System.out.println();
        }
    }
}
