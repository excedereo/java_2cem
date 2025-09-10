package vehicles;

public class Car {
    private String ownerName;
    private int insuranceNumber;
    protected String engineType;

    //геттеры
    public String getOwnerName(){
        return this.ownerName;
    }
    public int getInsuranceNumber(){
        return this.insuranceNumber;
    }
    public String getEngineType(){
        return this.engineType;
    }

    //сеттеры
    public void setOwnerName(String OwnerName){
        this.ownerName = OwnerName;
    }
    public void setInsuranceNumber(int insuranceNumber){
        this.insuranceNumber = insuranceNumber;
    }
    public void setEngineType(String engineType){
        this.engineType = engineType;
    }
}

