package Bike;

public interface MountainParts {
    String TERRAIN = "off_road";
    //Геттеры
    String getSuspension();
    String getType();

    //Сеттеры
    void setSuspension(String newValue);
    void setType(String newValue);
}
