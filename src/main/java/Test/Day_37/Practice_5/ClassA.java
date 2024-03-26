package Test.Day_37.Practice_5;

import java.sql.SQLOutput;

public class ClassA implements Temel1,Temel2,Temel3{
    @Override
    public void uyari1() {
        System.out.println("Uyari - 1");
    }

    @Override
    public void uyari2() {
        System.out.println("Uyari - 2");
    }

    @Override
    public void uyari3() {
        System.out.println("Uyari - 3");
    }
}
