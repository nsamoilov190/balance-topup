import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        int balance = 100;
        int topup = 1000;
        int baltopup = balance + topup;
        if (baltopup > 1000) {
            System.out.println(baltopup + (topup / 100));
        }
        else {
            System.out.println(baltopup);
        }

    }
}