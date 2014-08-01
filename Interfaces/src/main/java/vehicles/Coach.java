package vehicles;

/**
 * author: Bartek
 */
public class Coach extends Vehicle implements IVehicle {

    public Coach() {
        speed = 25;
    }

    public void goForward() {
        System.out.println("Autobus jedzie do przodu z prędkością: " + speed);
    }

    @Override
    public void goBackward() {
        System.out.println("Autobus jedzie do tyłu z prędkością: " + speed);
    }

    @Override
    public void stop() {
        System.out.println("Autobus staje");
    }

    @Override
    public String toString() {
        return "Coach{} " + super.toString();
    }
}
