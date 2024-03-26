package Test.Day_31.Practice_3;

public class Main {
    public static void main(String[] args) {

        Student student = new Student("john","smith",45,3000,2000,1986,'A',"Matematik","dfjghdfijgh78687",50,40.9);

        double maddiDurum = student.maddiDurum();
        String dersDurumu = student.dersDurumu();

        if(maddiDurum <= 1500 && dersDurumu.equals("Tebrikler dersi gectiniz!!!")){
            System.out.println("Tebrikler burs kazandiniz");
        }else{
            System.out.println("Malesef burs kazanamadiniz");
        }







    }
}
