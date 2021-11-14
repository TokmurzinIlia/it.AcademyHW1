package by.itacademy.task4;

import by.itacademy.task4.CargoCar.AirborneCargoCar;
import by.itacademy.task4.CargoCar.AwningCargoCar;
import by.itacademy.task4.CargoCar.IsothermalCargoCar;
import by.itacademy.task4.PassengerCar.CupePassengerCar;
import by.itacademy.task4.PassengerCar.MinivanPassengerCar;
import by.itacademy.task4.PassengerCar.SedanPassengerCar;
import by.itacademy.task4.PassengerCar.UniversalPassengerCar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        TaxiStation taxiStation = new TaxiStation();
        SedanPassengerCar sedan1 = new SedanPassengerCar("2125","Lada", "Kalina", 7,
                7500, 185);
        UniversalPassengerCar unversal1 = new UniversalPassengerCar("4568", "Audi", "F6",
                6, 25000, 250);
        MinivanPassengerCar minivanPassengerCar1 = new MinivanPassengerCar("4612", "KIA",
                "Carnival", 8, 10000,180);
        CupePassengerCar cupe1 = new CupePassengerCar("4516", "Peugeot", "406", 6.5,
                5000,220);
        AirborneCargoCar airborneCargoCar1 = new AirborneCargoCar("2687", "Mercedes", "Atego",
                15,50000,120, 4, 2, 10);
        AwningCargoCar awningCargoCar = new AwningCargoCar("4315", "Volvo", "FH12", 20,
                60000, 150, 3, 2, 15,25);
        IsothermalCargoCar isothermalCargoCar1 = new IsothermalCargoCar("6347", "MAZ", "4325",
                40,10000,80, 2, 2, 15);

        taxiStation.put(sedan1);
        taxiStation.put(unversal1);
        taxiStation.put(cupe1);
        taxiStation.put(minivanPassengerCar1);
        taxiStation.put(airborneCargoCar1);
        taxiStation.put(awningCargoCar);
        taxiStation.put(isothermalCargoCar1);

        taxiStation.getSortFuelConsumption(0, 10, taxiStation);

        taxiStation.getSortFuelConsumption(10, 15, taxiStation);

        taxiStation.getSortFuelConsumption(15, 100, taxiStation);

        taxiStation.getSortSpeedInterval(100, 150, taxiStation);

        taxiStation.getSortSpeedInterval(150, 200, taxiStation);

        taxiStation.getSortSpeedInterval(200, 300, taxiStation);

        taxiStation.getPriceTaxiStation(taxiStation);

    }
}
