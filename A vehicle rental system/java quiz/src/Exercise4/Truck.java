package Exercise4;

public class Truck extends Vehicle{

    public Truck(String type, int daysRented, boolean hasInsurance) {
        super(type, daysRented, hasInsurance);
    }

    public double calculateTotal() {
        double baseRate = 0;

        switch (getType()) {
            case "Truck":
                baseRate = 70; // daily rate
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
