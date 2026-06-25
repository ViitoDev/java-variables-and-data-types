package exercises.exercise05;

public class Main {
    public static void main(String[] args) {
        String title = "1984";
        String author = "George Owell";
        int pages = 416;
        double price = 13.50;
        String category = "F";

        if (category == "F") {
            System.out.println("The category is: Fiction");
        } else if (category == "N") {
            System.out.println("The category is: Non-fiction");
        } else if (category == "T") {
            System.out.println("The category is: Technology");
        } else if (category == "H") {
            System.out.println("The category is: History");
        } else {
            System.out.println("Category not found.");
        }
    }
}
