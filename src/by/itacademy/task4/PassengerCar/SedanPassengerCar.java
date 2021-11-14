package by.itacademy.task4.PassengerCar;

public class SedanPassengerCar extends PassengerCar {

   public SedanPassengerCar (
        String stateNumber, String brand, String model, double fuelConsumption, double price, double velocity){
            this.stateNumber = stateNumber;
            this.brand = brand;
            this.model = model;
            this.fuelConsumption = fuelConsumption;
            this.price = price;
            this.velocity = velocity;
            this.maxPassengers = 4;
            this.doors = 4;
    }
}
