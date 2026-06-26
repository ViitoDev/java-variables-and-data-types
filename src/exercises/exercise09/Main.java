package exercises.exercise09;

public class Main {
    public static void main(String[] args) {
        int age = 18;
        String message;

        if (age >= 18) {
            message = "You are of legal age.";
        } else {
            message = "You are a minor.";
        }
        System.out.println(message);
    }
}
