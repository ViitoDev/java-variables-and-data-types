package exercises.exercise08;

public class Main {
    public static void main(String[] args) {
        double amountInReais = 50;
        double dollarExchangeRate = 5.22;

        System.out.println("R$" + amountInReais + " is equal to US$" + (amountInReais / dollarExchangeRate));
    }
}
