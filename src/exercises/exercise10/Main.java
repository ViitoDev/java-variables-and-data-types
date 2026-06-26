package exercises.exercise10;

public class Main {
    public static void main(String[] args) {
        double averageConsumption = 12.5;
        double tankCapacity = 50;
        double currentTank = 20;
        double travelDistance = 200;

        double currentTankRange = currentTank * averageConsumption;
        double fullTankRange = tankCapacity * averageConsumption;

        System.out.println("Current tank range: " + currentTankRange);
        System.out.println("Full tank range: " + fullTankRange);

        if (currentTankRange >= travelDistance) {
            System.out.println("You can complete the trip without refueling.");
        } else {
            System.out.println("You can't complete the trip without refueling.");
        }
    }
}
