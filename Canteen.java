import java.util.Scanner;

public class Canteen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

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

        scanner.close();
    }
}