package Test.Day_34.Practice_5;

public class Child extends Parent{

    public void kisiBilgileri(){
        System.out.println("Kisi Bilgileri\n");
        System.out.println("Mother name : " + super.motherName);
        System.out.println("Father name : " + super.fatherName);
    }
}
