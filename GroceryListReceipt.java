import java.util.*; 

public class GroceryListReceipt {
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in); 

        System.out.println("Welcome to Zohra's Grocery List Receipt Generator!"); 

        // getting the number of items from the user
        System.out.println("Enter the number of items you bought: "); 
        int numOfItems = input.nextInt(); 

        // arrays for storing items, prices, and quantities
        String[] items = new String[numOfItems]; 
        double[] prices = new double[numOfItems];
        int[] quantities = new int[numOfItems]; 

        // gettng input for each item bought 
        for (int i = 0; i < numOfItems; i++) { 
            System.out.printf("Enter the name of item %d: ", i + 1); 
            items[i] = input.next(); 

            System.out.printf("Enter the price of %s: $", items[i]); 
            prices[i] = input.nextDouble();

            System.out.printf("Enter the quantity of %s: ", items[i]); 
            quantities[i] = input.nextInt(); 
        }

        // for generating the receipt 
        receiptGenerator(items, prices, quantities); 
    }

    public static void receiptGenerator(String[] items, double[] prices, int[] quantities) { 
        System.out.println("Your Grocery Receipt"); 
        System.out.println("==============================="); 

        double totalCost = 0.0; 

        // going through each item bought and calculating the cost
        for (int i = 0; i < items.length; i++) { 
            String itemName = items[i];
            double itemPrice = prices[i]; 
            int itemQuantity = quantities[i]; 

            double itemTotalCost = itemPrice * itemQuantity; 
            totalCost += itemTotalCost; 

            System.out.printf("%-15s x%d: $%.2f%n", itemName, itemQuantity, itemTotalCost);
        }

        System.out.println("==============================="); 
        System.out.printf("Total Cost: $%.2f%n", totalCost); 
    }
}
