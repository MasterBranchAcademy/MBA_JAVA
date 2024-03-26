package Test.Day_31.Practice_1;

public class Test {

    String firstName;
    String lastName;
    int age;
    double salary;
    double vergi;

    public Test(String firstName, String lastName, int age,double salary, double vergi){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
        this.vergi = vergi;
    }

    public String info(){
        return "Bilgiler: " + firstName + " " + lastName + " " + age + " " + salary;
    }

    public double netMaas(){
        return salary - vergi;
    }



}
