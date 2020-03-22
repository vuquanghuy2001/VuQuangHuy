package bai7;

public class testaccount {
    public static void main(String[] args) {
        account a1=new account(1234,99.99);
        System.out.println(a1);
        account a2=new account(8888);
        System.out.println(a2);

        a1.setBalance(88.88);
        System.out.println(a1);;
        System.out.println("The account Number is: "+a1.getAccountNumber());

        a1.credit(10);
        System.out.println(a1);
        a1.debit(500);
        System.out.println(a1);
    }
}
