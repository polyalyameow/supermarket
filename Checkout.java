import java.util.Locale;
import java.util.Scanner;

public class Checkout {

    public static void checkout(double totalPrice) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);

        System.out.println("Please insert money: ");
        double insertedMoney = scanner.nextDouble();

        if (totalPrice > insertedMoney) {
            System.out.println("Insufficient funds. Please insert more money.");
            scanner.close();
            return;
        }
        if (insertedMoney > totalPrice) {
            double change = insertedMoney - totalPrice;
            System.out.println("Thank you for your payment. Your change is: " + Math.round(change * 100.0) / 100.0);
        } else {
            System.out.println("Thank you for the exact amount. No change is needed.");
        }

        System.out.println("See ya soon!");
        scanner.close();
    }
}
