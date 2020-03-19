package bai3;

import javax.sound.midi.Soundbank;

public class ex8_4 {
    public static void main(String[] args) {
        int upperbound=100;
        for(int number=2;number<=upperbound;++number){
            int maxFactor=(int)Math.sqrt(number);
            for (int factor=2;factor<=maxFactor;++factor){
                if (number % factor ==0){
                    System.out.println(number+" is NOT a prime");
                    break;
                }
            }
        }
    }
}
