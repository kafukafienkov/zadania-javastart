import vehicles.*;

import java.util.ArrayList;

/**
 * author: Bartek
 */
public class Main {

    public static void main(String[] args) {

        Car car = new Car();
        Coach coach = new Coach();
        Truck truck = new Truck();

        ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
        vehicles.add(car);
        vehicles.add(coach);
        vehicles.add(truck);

        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.toString());
        }


        ArrayList<IVehicle> vehicles2 = new ArrayList<IVehicle>();
        vehicles2.add(car);
        vehicles2.add(coach);
        vehicles2.add(truck);

        for (IVehicle vehicle : vehicles2) {
            vehicle.goForward();
            vehicle.stop();
        }
    }
}
