package vehicles;

/**
 * author: Bartek
 */
public class Truck extends Vehicle implements IVehicle {

    public Truck() {
        speed = 35;
    }

    @Override
    public void goForward() {
        System.out.println("Ciężarówka jedzie do przodu z prędkością: " + speed);
    }

    @Override
    public void goBackward() {
        System.out.println("Ciężarówka jedzie do tyłu z prędkością: " + speed);
    }

    @Override
    public void stop() {
        System.out.println("Ciężarówka staje");
    }

    @Override
    public String toString() {
        return "Truck{} " + super.toString();
    }
}
