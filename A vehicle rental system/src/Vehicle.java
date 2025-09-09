public class Vehicle {


    private String type;
    private int daysRented;
    private boolean hasInsurance;

    public Vehicle(String type, int daysRented, boolean hasInsurance) {
        this.type = type;
        this.daysRented = daysRented;
        this.hasInsurance = hasInsurance;
    }

    public String getType() {
        return type;
    }

    public int getDaysRented() {
        return daysRented;
    }

    public boolean getHasInsurance() {
        return hasInsurance;
    }

}
