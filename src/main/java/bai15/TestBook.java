package bai15;

public class TestBook {
    public static void main(String[] args) {
//        Author codelean=new Author("Code Lean","codeleanvn@gmail.com",'f');
//        System.out.println(codelean);
//
//        Book dummyBook=new Book("Java for dummy",codelean,19.95,99);
//        System.out.println(dummyBook);
//
//        dummyBook.setPrice(29.95);
//        dummyBook.setQty(28);
//        System.out.println("name is: "+dummyBook.getName());
//        System.out.println("price is: "+dummyBook.getPrice());
//        System.out.println("qty is: "+dummyBook.getQty());
//        System.out.println("Author is: "+dummyBook.getAuthor());
//        System.out.println("Author's name is: "+dummyBook.getAuthor().getName());
//        System.out.println("Author's email is: "+dummyBook.getAuthor().getEmail());
//
//        Book anotherBook=new Book("more Java",
//                new Author("dang Kim Thi","dangkimthi@gmail.com",'f'),19.95);
//        System.out.println(anotherBook);

        Author[] authors=new Author[2];
        authors[0]=new Author("Tan Ah Teck","AhTeck@somewhere.com",'m');
        authors[1]=new Author("Paul Tan","Pau@nowhere.com",'m');


        Book javaDummy=new Book("Java for Dummy",authors,19.99,99);
        System.out.println(javaDummy);
    }
}
