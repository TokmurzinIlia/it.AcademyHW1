package by.itacademy.task4.CargoCar;

public class AwningCargoCar extends CargoCar{

    double bodyVolume;

    public AwningCargoCar(String stateNumber, String brand, String model, double fuelConsumption, double price, double velocity,
                          int maxPassengers, int doors, double сarryingСapacity, double bodyVolume)
    {
        super(stateNumber, brand, model, fuelConsumption, price, velocity, maxPassengers, doors, сarryingСapacity);

        this.bodyVolume = bodyVolume;
    }
}
