package inheritance;

public class Motorcycle extends Vehicle {

    int engineSize;
    boolean hasSideCar;

    public Motorcycle(String make, String model, int year, double price, int engineSize, boolean hasSideCar) {
        super(make, model, year, price);
        this.engineSize = engineSize;
        this.hasSideCar = hasSideCar;
    }

    public int getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(int engineSize) {
        this.engineSize = engineSize;
    }

    public boolean hasSideCar() {
        return hasSideCar;
    }

    public void setSideCar(boolean hasSideCar) {
        this.hasSideCar = hasSideCar;
    }

    @Override
    public String toString() {
        return "Motorcycle{"
                + "engineSize=" + engineSize
                + ", hasSideCar=" + hasSideCar
                + "} " + super.toString();
    }

    public double calculateResaleValue() {
        return getPrice();
    }
}
