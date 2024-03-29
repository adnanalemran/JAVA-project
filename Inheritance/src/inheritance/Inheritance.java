package inheritance;

public class Inheritance {

    public static void main(String[] args) {
        
        Car car = new Car("Toyota", "Camry", 2020, 25000.0, 4, true);
        
        Motorcycle motorcycle = new Motorcycle("Harley-Davidson", "Sportster", 2019, 12000.0, 1200, false);
        
        Truck truck = new Truck("Ford", "F-150", 2022, 35000.0, 1500.0, true);
 
        System.out.println("Resale Value: " + car.calculateResaleValue());
        System.out.println("Resale Value: " + motorcycle.calculateResaleValue());
        System.out.println("Resale Value: " + truck.calculateResaleValue());
    }

}
