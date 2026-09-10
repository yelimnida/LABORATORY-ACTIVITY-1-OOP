import java.util.Scanner;

public class Canteen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalItems = 0;
        double totalBeforeDiscount = 0.0;
        double totalDiscount = 0.0;

        char orderAgain = 'Y';

        //menu menu menuu

        while (orderAgain == 'Y' || orderAgain == 'y') {
            System.out.println("===== M E N U =====");
            System.out.println("1. Burger     - $80.00");
            System.out.println("2. Pizza      - $120.00");
            System.out.println("3. Pasta      - $100.00");
            System.out.println("4. Sandwich   - $70.00");
            System.out.println("5. Milk Tea   - $90.00");
            System.out.println();

            System.out.print("Enter item number: ");
            int itemNumber = scanner.nextInt();

            System.out.print("Enter quantity: ");
            int quantity = scanner.nextInt();

            // validate order
            if (itemNumber < 1 || itemNumber > 5 || quantity < 1 || quantity > 10) {
                System.out.println("\nInvalid order! Please enter a valid item and quantity.\n");
                
                System.out.print("Do you want to order again? (Y/N): ");
                orderAgain = scanner.next().charAt(0);
                System.out.println();
                continue;
            }

            System.out.print("Are you a student? (Y/N): ");
            char checkStudent = scanner.next().charAt(0);
            boolean isStudent = (checkStudent == 'Y' || checkStudent == 'y');

            double price = 0.0;
            switch (itemNumber) {
                case 1: price = 80.00; break;
                case 2: price = 120.00; break;
                case 3: price = 100.00; break;
                case 4: price = 70.00; break;
                case 5: price = 90.00; break;
            }

            double subtotal = price * quantity;

            double discount = 0.0;
            if (isStudent && subtotal >= 500.0) {
                discount = 0.15;
            } else if (isStudent) {
                discount = 0.10;
            } else if (subtotal >= 500.0) {
                discount = 0.05;
            }

            double discountAmount = subtotal * discount;
            double orderTotal = subtotal - discountAmount;

            // order output
            System.out.println();
            System.out.printf("Subtotal: $%.2f%n", subtotal);
            System.out.printf("Discount: $%.2f%n", discountAmount);
            System.out.printf("Order total: $%.2f%n", orderTotal);
            System.out.println();

            // total total
            totalItems += quantity;
            totalBeforeDiscount += subtotal;
            totalDiscount += discountAmount;

            System.out.print("Do you want to order again? (Y/N): ");
            orderAgain = scanner.next().charAt(0);
            System.out.println();
        }

        // summary and end
        double finalAmount = totalBeforeDiscount - totalDiscount;

        System.out.println("----- ORDER SUMMARY -----");
        System.out.println("Total items: " + totalItems);
        System.out.printf("Total before discount: $%.2f%n", totalBeforeDiscount);
        System.out.printf("Total discount: $%.2f%n", totalDiscount);
        System.out.printf("Final amount: $%.2f%n", finalAmount);
        System.out.println("Thank you for ordering!");

        scanner.close();
    }
}