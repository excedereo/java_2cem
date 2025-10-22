package vehicles;

public class ElectricCar extends Car implements ElectricVehicle {
    private int batteryCapacity;

    //Сеттеры
    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    //Геттеры
    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public String vehicleType() {
        return ("Electric Car");
    }

    public ElectricCar(){
        super();
    }
    public ElectricCar(String model, String license, String color, int year,
               String ownerName, int insuranceNumber, String engineType) {
        super(model, license, color, year, ownerName, insuranceNumber, "Electric");
    }
}
