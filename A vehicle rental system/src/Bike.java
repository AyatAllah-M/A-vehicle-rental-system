
    public class Bike extends Vehicle{

        public Bike(String type, int daysRented, boolean hasInsurance) {
            super(type, daysRented, hasInsurance);
        }

        public double calculateTotal() {
            double baseRate = 0;

            switch (getType()) {
                case "Bike":
                    baseRate = 30; // daily rate
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

