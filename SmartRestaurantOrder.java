import java.util.Scanner;

public class SmartRestaurantOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter customer's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter customer's age: ");
        int age = scanner.nextInt();

        System.out.print("Enter price of the meal: ");
        double mealPrice = scanner.nextDouble();

        System.out.print("Enter number of drinks ordered: ");
        int drinksCount = scanner.nextInt();

        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();

        System.out.print("Enter service rating from 1 to 5: ");
        int rating = scanner.nextInt();

        
        if (rating < 1 || rating > 5) {
            System.out.println("Error: Service rating must be between 1 and 5!");
        } else {
            
            double drinkPrice = 15.50;
            double totalDrinks = drinksCount * drinkPrice;
            double subtotal = mealPrice + totalDrinks;

            
            double discount = 0.0;
            if (isStudent && age >= 60) {
                
                discount = subtotal * 0.10;
            } else if (isStudent) {
                discount = subtotal * 0.10;
            } else if (age >= 60) {
                discount = subtotal * 0.05;
            }

            
            double tip = 0.0;
            if (rating == 4 || rating == 5) {
                tip = subtotal * 0.10;
            }

            double finalBill = (subtotal - discount) + tip;
            
            int wholeAmount = (int) finalBill;

            System.out.println("\n--- SMART RESTAURANT RECEIPT ---");
            System.out.println("Customer: " + name);
            System.out.println("Meal: $" + mealPrice);
            System.out.println("Drinks: $" + totalDrinks);
            System.out.println("Discount: $" + discount);
            System.out.println("Tip: $" + tip);
            System.out.println("Final bill: $" + finalBill);
            System.out.println("Whole amount: $" + wholeAmount);
        }

        scanner.close();
    }
}