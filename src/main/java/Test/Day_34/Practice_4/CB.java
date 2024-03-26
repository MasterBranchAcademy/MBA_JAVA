package Test.Day_34.Practice_4;

public class CB {

    String cbName;
    int cbYas;

    public CB(String cbName, int cbYas) {
        this.cbName = cbName;
        this.cbYas = cbYas;
    }

    @Override
    public String toString() {
        return "CB{" +
                "cbName='" + cbName + '\'' +
                ", cbYas=" + cbYas +
                '}';
    }
}
