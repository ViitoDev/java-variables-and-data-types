package exercises.exercise10;

public class Main {
    public static void main(String[] args) {
        double averageConsumption = 12.5; // km per liter
        double tankCapacity = 50;
        double currentTank = 20;
        double travelDistance = 200;

        double calculateCurrentTank = currentTank * averageConsumption;
        double calculateMaximumTank = tankCapacity * averageConsumption;

        System.out.println("Current Tank: " + calculateCurrentTank);
        System.out.println("Complete Tank: " + calculateMaximumTank);
        
        if (calculateCurrentTank >= travelDistance) {
            System.out.println("You can complete the trip without refueling.");
        } else  {
            System.out.println("You can't complete the trip without refueling.");
        }

    }
}
