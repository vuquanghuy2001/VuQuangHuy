package bai7;

public class account {
    private  int acountNumber;
    private double balance;

    public account(int acountNumber,double balance){
        this.acountNumber=acountNumber;
        this.balance=balance;
    }
    public account(int acountNumber){
        this.acountNumber=acountNumber;
        this.balance=0.0;
    }
    public int getAccountNumber(){
        return  this.acountNumber;
    }
    public  double getBalance(){
        return this.balance;
    }
    public void setBalance(double balance){
        this.balance=balance;
    }
    public void credit(double amount){
        balance+=amount;
    }
    public void debit(double amount){
        if (balance<amount){
            System.out.println("amout withdrawn exceeds the current balance!");
        }else {
            balance-=amount;
        }
    }
    public String toString(){
        return String.format("A/C no:%d,balance=%.2f",acountNumber,balance);
    }
}
