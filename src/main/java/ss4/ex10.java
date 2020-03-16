package ss4;

public class ex10 {
    public static void main(String[] args) {
        String day="monday";
        String hour="am";
        switch (day){
            case "sunday":
                System.out.println("Sunday is a Holiday...");

                switch (hour){
                    case "am":
                        System.out.println("good morning");
                        break;
                }
                break;
            case "monday":
                System.out.println("monday is a working day...");
                switch (hour){
                    case "am":
                        System.out.println("good morning");
                        break;
                    case "pm":
                        System.out.println("good evening");
                        break;
                }
                break;
            default:
                System.out.println("invalid day");
        }
    }
}
