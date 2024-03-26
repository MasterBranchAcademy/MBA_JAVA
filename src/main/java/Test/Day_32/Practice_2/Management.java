package Test.Day_32.Practice_2;

public class Management {

    static String nameOfPrincipal;
    final String nameOfTheSchool = "Master Branch Academy";
    int numberOfStudent;
    int numberOfTeacher ;

    public Management( int numberOfStudent, int numberOfTeacher) {
        this.numberOfStudent = numberOfStudent;
        this.numberOfTeacher = numberOfTeacher;
    }

    @Override
    public String toString() {
        return "Management{" +
                "nameOfTheSchool='" + nameOfTheSchool + '\'' +
                ", numberOfStudent=" + numberOfStudent +
                ", numberOfTeacher=" + numberOfTeacher +
                "principal = "+ nameOfPrincipal +
                '}';
    }
}
