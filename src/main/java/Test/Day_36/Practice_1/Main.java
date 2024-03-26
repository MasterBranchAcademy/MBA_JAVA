package Test.Day_36.Practice_1;

public class Main {
    public static void main(String[] args) {

        Cars cars = new Cars("BMW");

        String carName = cars.getCarName();

        System.out.println("carName: " + carName);

        //cars.carName = "Mercedes";
        cars.setCarName("Mercedes");
        System.out.println("carName: " + cars.getCarName());

        System.out.println(cars.toString());





    }
}
