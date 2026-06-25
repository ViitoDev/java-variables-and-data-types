package exercises.exercise06;

public class Main {
    public static void main(String[] args) {
        double price = 300;

        if (price <= 50) {
            System.out.println("Price = " + price + "\nCategory = Economic");
        } else if (price <= 200) {
            System.out.println("Price = " + price + "\nCategory = Intermediate");
        } else if (price > 200) {
            System.out.println("Price = " + price + "\nCategory = Premium");
        } else {
            System.out.println("Price not found.");
        }
    }
}
