package bai18.son;

import bai18.dad.Monster;

public class WaterMonster extends Monster {
    public WaterMonster(String name){
        super(name);
    }
    @Override
    public String attack(){
        return "Attack with water!";
    }
}
