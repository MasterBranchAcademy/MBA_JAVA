package Test.Day_30.Practice_3;

public class Main {
    public static void main(String[] args) {

       //mercedes
        Car car_1 = new Car();
        car_1.name = "mercedes";
        car_1.price = 30000;
        car_1.speed = 120.5;
        car_1.carInfo();


        //Porche
        Car car_2 = new Car();
        car_2.name = "Porche";
        car_2.price= 50000;
        car_2.speed=150.7;
        car_2.carInfo();
    }
}
