package Test.Day_34.Practice_2;

public class ABC {

    String sirketIsmi;
    int yillikCiro;

    public ABC(String sirketIsmi, int yillikCiro) {
        this.sirketIsmi = sirketIsmi;
        this.yillikCiro = yillikCiro;
    }

    public void sirketBilgileri(){
        System.out.println("Sirket Ismi : " + sirketIsmi);
        System.out.println("Yillik Ciro : " + yillikCiro);
    }
}
