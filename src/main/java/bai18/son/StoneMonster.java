package bai18.son;

import bai18.dad.Monster;

public class StoneMonster extends Monster {
    public StoneMonster(String name){
        super(name);
    }
    @Override
    public String attack(){
        return "Attack with Stone!";
    }
}
