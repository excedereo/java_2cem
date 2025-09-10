package vehicles;

public abstract class Vehicle {
    private String model; //(модель)
    private String license; //(номерной знак)
    private String color; //(цвет)
    private int year; //(год выпуска)
    private String ownerName; //(имя владельца)
    private int insuranceNumber; //(страховой номер)
    protected String engineType; //(тип двигателя)

    //Абстрактный метод vehicleType
    public abstract String vehicleType();

    //Геттеры
    public String getModel() {
        return this.model;}
    public String getLicense() {
        return this.license;}
    public String getColor() {
        return this.color;}
    public int getYear() {
        return this.year;}
    public String getOwnerName() {
        return this.ownerName;}
    public int getInsuranceNumber() {
        return this.insuranceNumber;}
    public String getEngineType() {
        return this.engineType;}

    // Сеттеры
    public void setModel(String model) {
        this.model = model;}
    public void setLicense(String license) {
        this.license = license;}
    public void setColor(String color) {
        this.color = color;}
    public void setYear(int year) {
        this.year = year;}
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;}
    public void setInsuranceNumber(int insuranceNumber) {
        this.insuranceNumber = insuranceNumber;}
    public void setEngineType(String engineType) {
        this.engineType = engineType;}
}
