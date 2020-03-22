package bai7;

public class testtime3 {
    public static void main(String[] args) {
        time3 t1=new time3(1,2,3);
        System.out.println(t1);

        time3 t2=new time3(60,59,12);

        try{
            time3 t3 =new time3(60,59,12);
            System.out.println("This line will be skipped,if exception occurs");
        }catch (IllegalArgumentException ex){
            ex.printStackTrace();
        }
        System.out.println("Continue after exception!");
    }
}
