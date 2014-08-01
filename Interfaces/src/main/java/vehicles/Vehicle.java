package vehicles;

/**
 * author: Bartek
 */
public abstract class Vehicle {

    /**
     * protected - dostęp z tej klasy
     * oraz z klas dziedziczących po Vehicle
     */
    protected int speed;

    @Override
    public String toString() {
        return "Vehicle{" +
                "speed=" + speed +
                '}';
    }
}
