package bai18.son;

import bai18.dad.A;

public class B extends A {
    public B(){
        super();
        System.out.println("Contructed an instance of B");
    }
    @Override
    public String toString(){
        return "This is B";
    }
}
