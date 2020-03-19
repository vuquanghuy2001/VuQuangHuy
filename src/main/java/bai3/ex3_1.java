package bai3;

public class ex3_1 {
    private static String Long_MIN_VALUE;
    private static String Long_MAX_VALUE;

    public static void main(String[] args) {
        System.out.println("int(min)= "+Integer.MIN_VALUE);
        System.out.println("int(max)= "+Integer.MAX_VALUE);
        System.out.println("int(bit-length)= "+Integer.SIZE);

        System.out.println("byte(min)= "+Byte.MAX_VALUE);
        System.out.println("byte(max)= "+Byte.MIN_VALUE);
        System.out.println("byte(bit-length="+Byte.SIZE);

        System.out.println("short(min)= "+Short.MIN_VALUE);
        System.out.println("short(max)= "+Short.MAX_VALUE);
        System.out.println("short(bit-length)= "+Short.SIZE);

        System.out.println("Long(min)= "+Long_MIN_VALUE);
        System.out.println("Long(max)= "+Long_MAX_VALUE);
        System.out.println("Long(bit-length= "+Long.SIZE);

        System.out.println("char(min)= "+(int)Character.MIN_VALUE);
        System.out.println("char(max)= "+(int)Character.MAX_VALUE);
        System.out.println("char(bit-length= "+Character.SIZE);

        System.out.println("float(min)= "+Float.MIN_VALUE);
        System.out.println("float(max)= "+Float.MAX_VALUE);
        System.out.println("float(bit-length)= "+Float.SIZE);

        System.out.println("double(min)= "+Double.MIN_VALUE);
        System.out.println("souble(max)="+Double.MAX_VALUE);
        System.out.println("double(bit-legth)="+Double.SIZE);
    }
}
