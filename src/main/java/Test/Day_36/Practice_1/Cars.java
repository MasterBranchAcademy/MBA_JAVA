package Test.Day_36.Practice_1;

public class Cars {
    private String carName;

    public Cars(String carName){
        this.carName = carName;
    }

    public String getCarName(){
        return carName;
    }

    public void setCarName(String carName) {//"Mercedes"
        this.carName = carName;//this.carName ="Mercedes"
    }

    @Override
    public String toString() {
        return "Cars : " +
                "carName='" + carName + '\'';
    }
}
