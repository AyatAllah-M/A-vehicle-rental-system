//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

                Car car = new Car("Car", 5, true);
                Bike bike = new Bike("Bike",2, false);
                Truck truck = new Truck("Truck", 5, true);

                System.out.println("Car rental total: $" + car.calculateTotal());
                System.out.println("Bike rental total: $" + bike.calculateTotal());
                System.out.println("Truck rental total: $" + truck.calculateTotal());

    }
}