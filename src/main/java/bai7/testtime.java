package bai7;

public class testtime {
    public static void main(String[] args) {
        time t1=new time(1,2,3);
        System.out.println(t1);
        time t2=new time();
        System.out.println(t2);

        t1.setHour(4);
        t1.setMinute(5);
        t1.setSecond(6);
        System.out.println("hour is: "+t1.getHour());
        System.out.println("minute is: "+t1.getMinute());
        System.out.println("second is: "+t1.getSecond());

        t1.settime(58,59,23);
        System.out.println(t1);

        System.out.println(t1.nextSecond());
        System.out.println(t1.nextSecond().nextSecond().nextSecond());
    }
}
