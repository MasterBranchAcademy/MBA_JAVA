package Test.Day_31.Practice_2;

public class Triangle {

    double kenar_1;
    double kenar_2;
    double taban;
    double yukseklik;

    public Triangle(double kenar_1, double kenar_2, double taban, double yukseklik){
            this.kenar_1 = kenar_1;
            this.kenar_2 = kenar_2;
            this.taban = taban;
            this.yukseklik = yukseklik;
    }

    public double cevre(){
        return kenar_1 + kenar_2 + taban;
    }

    public double alan(){
        return (yukseklik * taban)/2;
    }


}
