package vehicles;

//Организуем наследование абстрактного класса
public class Car extends Vehicle {

    //Реализация метода
    public String vehicleType() {
        return "Car";
    }
    //Конструктор Car использующий поля и методы родительского класса и возвращающий тип двигателя Combustion
    public Car(String model, String license, String color, int year,
               String ownerName, int insuranceNumber, String engineType) {
        super(model, license, color, year, ownerName, insuranceNumber, "Combustion");
    }
    public Car() {
    }
}

