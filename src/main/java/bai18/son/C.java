package bai18.son;

import bai18.dad.A;

public class C extends B {
    public C(){
        super();
        System.out.println("Contructed an instance of C");
    }
    @Override
    public String toString(){
        return "This is C";
    }
}
