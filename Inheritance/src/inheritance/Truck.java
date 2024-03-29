package inheritance;

public class Truck extends Vehicle {

    double cargoCapacity;
    boolean isFourWheelDrive;

    public Truck(String make, String model, int year, double price, double cargoCapacity, boolean isFourWheelDrive) {
        super(make, model, year, price);
        this.cargoCapacity = cargoCapacity;
        this.isFourWheelDrive = isFourWheelDrive;
    }

    public double getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(double cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public boolean isFourWheelDrive() {
        return isFourWheelDrive;
    }

    public void setFourWheelDrive(boolean fourWheelDrive) {
        isFourWheelDrive = fourWheelDrive;
    }

    @Override
    public String toString() {
        return "Truck{"
                + "cargoCapacity=" + cargoCapacity
                + ", isFourWheelDrive=" + isFourWheelDrive
                + "} " + super.toString();
    }

    public double calculateResaleValue() {
        return getPrice();
    }
}
