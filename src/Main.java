import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        LuhnCheck card = new LuhnCheck();
        Scanner number = new Scanner(System.in);
        System.out.println("Enter card number: ");
        long cardNubmber = number.nextLong();

        if (card.luhnCheck(cardNubmber)) {
            System.out.println("Card: " + cardNubmber + " is valid");
        } else {
            System.out.println("Card: " + cardNubmber + " in invalid");
        }
        number.close();
    }

}
