package bai15;

public class Customer2 {
    private int ID;
    private String name;
    private char gender;

    public Customer2(int ID,String name,char gender){
        this.ID=ID;
        this.name=name;
        this.gender=gender;
    }
    public int getID(){
        return this.ID;
    }
    public String getName(){
        return this.name;
    }
    public char getGender(){
        return this.gender;
    }
    public String toString(){
        return "customer[ID="+ID+"]";
    }
}
