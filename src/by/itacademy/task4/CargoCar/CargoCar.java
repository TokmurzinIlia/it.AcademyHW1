package by.itacademy.task4.CargoCar;

import by.itacademy.task4.Car;
import by.itacademy.task4.interfaces.boardingDisembarkationPassenger;
import by.itacademy.task4.interfaces.loadUnloadCargo;

public class CargoCar extends Car implements loadUnloadCargo, boardingDisembarkationPassenger {

    double сarryingСapacity;

    CargoCar(String stateNumber, String brand, String model, double fuelConsumption, double price, double velocity
             , int maxPassengers, int doors, double сarryingСapacity)
    {
        super(stateNumber, brand, model, fuelConsumption, price, velocity
             ,  maxPassengers, doors);

        this.сarryingСapacity = сarryingСapacity;

    }
}
