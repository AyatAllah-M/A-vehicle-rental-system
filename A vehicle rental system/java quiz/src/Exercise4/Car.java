package Exercise4;

public class Car extends Vehicle{

    public Car(String type, int daysRented, boolean hasInsurance) {

        super(type, daysRented, hasInsurance);
    }

    public double calculateTotal() {
        double baseRate = 0;

        switch (getType()) {
            case "Car":
                baseRate = 50; // daily rate
                break;
        }

        double total = 0;

        for (int i = 0; i < getDaysRented(); i++) {
            total += baseRate;
        }

        // Add insurance
        if (getHasInsurance()) {
            total += 20; // flat insurance fee
        }

        return total;
    }
}
