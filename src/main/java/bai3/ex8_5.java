package bai3;

public class ex8_5 {
    public static void main(String[] args) {
        int upperbound=100;
        for(int number=2;number<=upperbound;++number){
            int maxFactor=(int)Math.sqrt(number);
            boolean isPrime=true;
            for (int factor=2;factor<=maxFactor;++factor){
                if (number % factor ==0){
                   isPrime=false;
                    break;
                }
            }
            if (isPrime) System.out.println(number + " is a prime");
        }
    }
}
