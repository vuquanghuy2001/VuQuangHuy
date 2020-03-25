package bai14;

public class Testbook {
    public static void main(String[] args) {
        Author ahteck=new Author("Tan Ah Teck","ahteck@somewhere.com",'m');
        System.out.println(ahteck);

        book dummyBook=new book("Java for dummies",ahteck,9.99,99);
        System.out.println(dummyBook);
        dummyBook.setPrice(8.88);
        dummyBook.setQty(88);
        System.out.println("name is: "+dummyBook.getName());
        System.out.println("price is: "+dummyBook.getPrice());
        System.out.println("qty is: "+dummyBook.getQty());

        System.out.println("author is: "+dummyBook.getAuthor());
        System.out.println("author'd name is: "+dummyBook.getAuthor().getName());
        System.out.println("author's email is: "+dummyBook.getAuthor().getEmal());
        System.out.println("author's gender is: "+dummyBook.getAuthor().getGender());

        book moreDummyBook =new book("Java for move dummies",
                new Author("Peter lee","peter@nowhere.com",'m'),19.99,8);
        System.out.println(moreDummyBook);
    }
}
