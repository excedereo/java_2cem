package Bike;

public interface RoadParts {
    String TERRAIN = "track_racing";

    //Геттеры
    int getTyreWidth();
    int getPostHeight();

    //Сеттеры
    void setTyreWidth(int newValue);
    void setPostHeight(int newValue);
}