package bai3;

public class ex8_8 {
    public static void main(String[] args) {
        int[][] testArray={
                {1,2,3,4},
                {4,3,2,1},
                {9,2,3,4}
        };

        int magicNumber=8;
        boolean found=false;
        for (int i=0;i<testArray.length;++i){
            for (int j=0;j<testArray[i].length;++j){
                if (testArray[i][j]==magicNumber){
                    found=true;
                    break;
                }
            }
        }
        System.out.println("Magic number"+(found? "found" : "NOT found"));
    }
}
