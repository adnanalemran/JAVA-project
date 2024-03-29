package inheritance;

public class Car extends Vehicle {

    int numDoors;
    boolean isConvertible;

    public Car(String make, String model, int year, double price, int numDoors, boolean isConvertible) {
        super(make, model, year, price);
        this.numDoors = numDoors;
        this.isConvertible = isConvertible;
    }

    public int getNumDoors() {
        return numDoors;
    }

    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }

    public boolean isConvertible() {
        return isConvertible;
    }

    public void setConvertible(boolean convertible) {
        isConvertible = convertible;
    }

    @Override
    public String toString() {
        return "Car{"
                + "numDoors=" + numDoors
                + ", isConvertible=" + isConvertible
                + "} " + super.toString();
    }

    public double calculateResaleValue() {
        return getPrice();
    }
}
