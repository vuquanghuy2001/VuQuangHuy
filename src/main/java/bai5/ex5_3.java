package bai3;

public class ex5_3 {
    public static void main(String[] args) {
        int mark=81;
        char grade;
        if (mark>80){
            grade = 'A';
        }
        if (mark>65 && mark<=80){
            grade = 'B';
        }
        if (mark>=50 && mark<=65){
            grade = 'C';
        }
        if (mark<50){
            grade = 'F';
        }

        int mark2=81;
        char grade2;
        if(mark2>80){
            grade2='A';
        }else if(mark2>65 && mark2<=80){
            grade2='B';
        }
        else if (mark2>=50 && mark2<=65){
            grade2='C';
        }else {
            grade2='F';
        }

        int mark3=81;
        char grade3;
        if(mark3>80){
            grade3='A';
        }else if(mark3>65){
            grade3='B';
        }else if (mark3>=50){
            grade3='C';
        }else {
            grade3='F';
        }
    }
}
