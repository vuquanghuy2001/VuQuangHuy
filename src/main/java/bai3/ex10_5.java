package bai3;

import java.util.Scanner;
import java.util.Arrays;
public class ex10_5 {
    public static void main(String[] args) {
        int numStudents;
        int[] grades;
        int[] bins=new int[10];
        Scanner in=new Scanner(System.in);

        System.out.print("Enter the number of student: ");
        numStudents=in.nextInt();

        grades=new int[numStudents];

        for (int i=0;i<grades.length;++i){
            System.out.print("Enter the grade for student "+(i+1)+": ");
            grades[i]=in.nextInt();
        }
        System.out.println(Arrays.toString(grades));
        for (int grade:grades){
            if (grade==100){
                ++bins[9];
            }else {
                ++bins[grade/10];
            }
        }
        System.out.println(Arrays.toString(bins));

        for (int binIdx=0;binIdx<bins.length;++binIdx){
            if (binIdx!=9){
                System.out.printf("%2d-%3d: ",binIdx*10,binIdx*10+9);
            }else {
                System.out.printf("%2d-3%d: ",99,100);
            }
            for (int itemNo=0;itemNo<bins[binIdx];++itemNo){
                System.out.print("*");
            }

            int binMax=bins[0];
            for (int binIdx2=1;binIdx2<bins.length;++binIdx2){
                if (binMax<bins[binIdx2]) binMax=bins[binIdx2];
            }

            for (int level=binMax;level>0;--level){
                for (int binIdx3=0;binIdx3<bins.length;++binIdx3){
                    if (bins[binIdx3]>=level){
                        System.out.print(" * ");
                    }else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            for (int binIdx4=0;binIdx4<bins.length;++binIdx4){
                System.out.printf("%3d-%-3d",binIdx4*10,(binIdx4!=9)? binIdx4*10+9:100);
            }
            System.out.println();
            in.close();
        }
    }
}
