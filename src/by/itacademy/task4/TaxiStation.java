package by.itacademy.task4;

import java.util.ArrayList;

import java.util.stream.Stream;

public class TaxiStation {
    ArrayList<Car> arrayList = new ArrayList();
    public void put(Car car){
        arrayList.add(car);
    }

    public Stream<Car> stream(){
        return arrayList.stream();
    }

    public static void getSortFuelConsumption (int from, int to, TaxiStation taxiStation) {
        System.out.println("Автомобили с расходом топлива от " + from + " по " +  to + " л/100км: ");
        Stream<Car> streamFromCollection = taxiStation.stream();
        streamFromCollection
                .filter(Car -> Car.getFuelConsumption() >= from && Car.getFuelConsumption() <= to)
                .forEach(System.out::println);

        System.out.println();
    }

    public static void getSortSpeedInterval (int from, int to, TaxiStation taxiStation) {
        System.out.println("Автомобили с максимальной скоростью от " + from + " по " +  to + " л/100км: ");
        Stream<Car> streamFromCollection = taxiStation.stream();
        streamFromCollection
                .filter(Car -> Car.getVelocity() >= from && Car.getFuelConsumption() <= to)
                .forEach(System.out::println);

        System.out.println();
    }
    public static void getPriceTaxiStation (TaxiStation taxiStation) {
        System.out.println("Стоимость автопарка: ");
        Stream<Car> streamFromCollection = taxiStation.stream();
        double sum = streamFromCollection
                .mapToDouble(Car::getPrice)
                .sum();
        System.out.println(sum);


        System.out.println();
    }
}
