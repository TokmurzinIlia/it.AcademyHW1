package by.itacademy.task4;

public abstract  class Car {

    protected String stateNumber;
    protected String brand;
    protected String model;

    protected double fuelConsumption;
    protected double price;
    protected double velocity;


    protected int maxPassengers;
    protected int doors;



    public Car(String stateNumber, String brand, String model, double fuelConsumption, double price, double velocity,
               int maxPassengers, int doors)
    {
        this.stateNumber = stateNumber;
        this.brand = brand;
        this.model = model;
        this.fuelConsumption = fuelConsumption;
        this.price = price;
        this.velocity = velocity;
        this.maxPassengers = maxPassengers;
        this.doors = doors;
    }

    protected Car()
    {
    }

    public String getStateNumber() {
        return stateNumber;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public double getPrice() {
        return price;
    }

    public double getVelocity() {
        return velocity;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public int getDoors() {
        return doors;
    }

    public void setStateNumber(String stateNumber) {
        this.stateNumber = stateNumber;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setVelocity(double velocity) {
        this.velocity = velocity;
    }

    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    @Override
    public String toString() {
        return "Автомобиль : " +
                "гоударственный номер: " + stateNumber + '\'' +
                ", марка:" + brand + '\'' +
                ", модель:" + model + '\'' +
                ", расход топлива: " + fuelConsumption + '\'' +
                ", стоимость: " + price + '\'' +
                ", максимальная скорость: " + velocity + '\'' +
                ", максимальное число пассажиров: " + maxPassengers + '\'' +
                ", количество дверей: " + doors +

                '}';
    }

}
