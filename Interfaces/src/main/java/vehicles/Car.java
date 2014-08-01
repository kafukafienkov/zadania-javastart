package vehicles;

/**
 * author: Bartek
 */
public class Car extends Vehicle implements IVehicle {

    public Car() {
        speed = 50;
    }

    @Override
    public void goForward() {
        System.out.println("Samochód jedzie do przodu z prędkością: " + speed);
    }

    @Override
    public void goBackward() {
        System.out.println("Samochód jedzie do tyłu z prędkością: " + speed);
    }

    @Override
    public void stop() {
        System.out.println("Samochód staje");
    }

    @Override
    public String toString() {
        return "Car{} " + super.toString();
    }
}
