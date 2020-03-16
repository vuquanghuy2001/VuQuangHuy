package ss4;

public class ex9 {
    enum cards{
        spade,heart,diamond,club
    }
    public static void main(String[] args) {
        cards card=cards.diamond;
        switch (card){
            case spade:
                System.out.println("SPADE");
                break;
            case heart:
                System.out.println("HEART");
                break;
            case club:
                System.out.println("CLUB");
                break;
            case diamond:
                System.out.println("DIAMOND");
                break;
        }
    }
}
