package app;

import vehicles.*;

public class TestCar {
    public static void main(String[] args) {
        // • Созданы экземпляры классов Car и ElectricCar.
        Car defaultCar = new Car();
        ElectricCar electricCar = new ElectricCar();

        // • Изменение года выпуска и имени владельца.
        System.out.println("Старое имя: "+electricCar.getOwnerName());
        electricCar.setOwnerName("David Martinez");
        System.out.println("Новое имя: "+electricCar.getOwnerName());

        System.out.println("Старый год: "+electricCar.getYear());
        electricCar.setYear(1969);
        System.out.println("Новый год: "+electricCar.getYear());

        // • Изменение страхового номера.
        System.out.println("Старый страховой номер: "+electricCar.getInsuranceNumber());
        electricCar.setInsuranceNumber(3217);
        System.out.println("Новый страховой номер: "+electricCar.getInsuranceNumber());

        // • Получение информации о емкости батареи у электромобиля.
        electricCar.setBatteryCapacity(123123);
        System.out.println("Емкость батареи: "+electricCar.getBatteryCapacity()+"\n");

        // • Вывод информации о транспортных средствах в консоль с помощью метода toString().
        System.out.println(defaultCar.toString());
        System.out.println(electricCar.toString());

    }
}