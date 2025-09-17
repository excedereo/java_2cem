package vehicles;

public class ElectricCar extends Car {
    public int batteryCapacity;

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }
    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public ElectricCar(){
        super();
    }
    { engineType = "Electric"; }
}
