package bai7;

public class teststudent {
    public static void main(String[] args) {
        student ahTeck=new student("Tan Ah Teck ","1 Happy Ave");
        System.out.println(ahTeck);
        ahTeck.setAddress("8 Kg java");
        System.out.println(ahTeck);
        System.out.println(ahTeck.getAddress());

        ahTeck.addCourseGrade("IM101",89);
        ahTeck.addCourseGrade("IM102",57);
        ahTeck.addCourseGrade("IM103",96);
        ahTeck.printGrades();
        System.out.printf("The average is %.2f%n",ahTeck.getAverageGrade());
    }
}
