import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        car car1 = new car(); //Вызов конструктора по умолчанию
        car car2 = new car("CarModelTemplate", 1987); //Вызов упрощенного конструктора
        car car3 = new car("AnotherCarModel", "b77op142","Blue",1966);//Вызов полного конструктора
        car3.To_String();
        System.out.println(car2.howOld());
        System.out.println(car1.getModel());
        car1.setModel("Audi m5-828");
        System.out.println(car1.getModel());
    }
}
