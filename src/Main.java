import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("What is Bitcoin price today?");
        double bitcoinPrice = in.nextDouble();
        System.out.println("How much $ do you have?");
        double money = in.nextDouble();

        System.out.println("You can buy "+money/bitcoinPrice+" BTC");
    }
}
