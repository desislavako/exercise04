import java.util.Scanner;

public class Calculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter unit price: ");
        double unitPrice = scanner.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();

        scanner.close();

        double revenue;
        double discount = 0.0;
        if (quantity < 100) {
            revenue = unitPrice * quantity;
        } else if (quantity >= 100 && quantity <= 120) {
            discount = 0.15; // 15% discount
            revenue = unitPrice * quantity * (1 - discount);
        } else {
            discount = 0.20; // 20% discount
            revenue = unitPrice * quantity * (1 - discount);
        }

        System.out.println("The revenue from sale: " + revenue + "$");
        System.out.println("Discount: " + (unitPrice * quantity * discount) + "$(" + (discount * 100) + "%)");
    }
}
