package by.itacademy.task4.CargoCar;

public class IsothermalCargoCar extends CargoCar{

    double bodyVolume;

    public IsothermalCargoCar(String stateNumber, String brand, String model, double fuelConsumption, double price, double velocity,
                              int maxPassengers, int doors, double сarryingСapacity)
    {
        super(stateNumber, brand, model, fuelConsumption, price, velocity, maxPassengers, doors, сarryingСapacity);

        this.bodyVolume = bodyVolume;
    }
}
