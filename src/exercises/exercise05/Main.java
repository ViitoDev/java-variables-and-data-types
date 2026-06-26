package exercises.exercise05;

public class Main {
    public static void main(String[] args) {
        String title = "1984";
        String author = "George Orwell";
        int pages = 416;
        double price = 13.50;
        String category = "F";

        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
        System.out.println("Price: $" + price);

        if (category.equals("F")) {
            System.out.println("The category is: Fiction");
        } else if (category.equals("N")) {
            System.out.println("The category is: Non-fiction");
        } else if (category.equals("T")) {
            System.out.println("The category is: Technology");
        } else if (category.equals("H")) {
            System.out.println("The category is: History");
        } else {
            System.out.println("Category not found.");
        }
    }
}
