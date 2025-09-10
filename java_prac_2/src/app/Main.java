package app;

import vehicles.*;

public class Main {
    public static void main(String[] args) {
        //Создание объектов
        Car defaultCar = new Car();
        ElectricCar electrocar = new ElectricCar();

        //Демонстрация обращения к приватным полям (только через сеттеры и геттеры)
        defaultCar.setOwnerName("Dio");
        electrocar.setOwnerName("Jotaro");

        System.out.println("Default car owner: "+defaultCar.getOwnerName()+"; Electrocar owner: "+electrocar.getOwnerName());

        //Демонстрация обращения к публичным полям
        electrocar.batteryCapacity = 6;
        System.out.println("Battery capacity = "+electrocar.batteryCapacity);
    }
}