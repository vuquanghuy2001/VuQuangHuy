package bai7;

public class testdate {
    public static void main(String[] args) {
        date d1=new date(2016,4,6);
        System.out.println(d1);

        d1.setYear(2012);
        d1.setMonth(12);
        d1.setDay(23);
        System.out.println(d1);
        System.out.println("year is: "+d1.getYear());
        System.out.println("Month is: "+d1.getMonth());
        System.out.println("Day is: "+d1.getDay());

        d1.setdate(2988,1,2);
        System.out.println(d1);
    }
}
