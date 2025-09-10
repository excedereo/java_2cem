public class car {
    public String model;
    public String license;
    public String color;
    public int year;

    public car(String model, String license, String color, int year) { //Конструктор со всеми полями
        this.model = model;
        this.license = license;
        this.color = color;
        this.year = year;
    }
    public car(String model, int year) { //Конструктор по умолчанию с выбранными полями
        this.model = model;
        this.year = year;
    }
    public car() { //Конструктор по умолчанию
    }

    //Метод вывода значений полей
    public void To_String() {
        System.out.println( "Модель: "+this.model+ " Номер: "+this.license+ " Цвет: "+this.color+ " Год: "+this.year);
    }

    //Сеттеры
    public void setModel(String model) {
        this.model = model;
    }
    public void setLicense(String license) {
        this.license = license;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setYear(int year) {
        this.year = year;
    }

    //Геттеры
    public String getModel() {
        return this.model;
    }
    public String geticense() {
        return this.license;
    }
    public String getColor() {
        return this.color;
    }
    public int getYear() {
        return this.year;
    }

    //Метод вычисления возраста автомобиля
    public int howOld() {
        return (2025-this.year);
    }
}