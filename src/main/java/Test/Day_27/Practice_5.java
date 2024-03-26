package Test.Day_27;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Practice_5 {
    public static void main(String[] args) {

        String item1 = "$49.99";
        String item2= "$54.80";
        String item3 = "$13.89";
        String sum = "$118.68";

        String item1_money = item1.replace("$","");//"49.99"
        String item2_money = item2.replace("$","");//"54.80"
        String item3_money = item3.replace("$","");//"13.89"
        String sum1 = sum.replace("$","");//"118.68"

        Double item1_Number = Double.parseDouble(item1_money);
        Double item2_Number = Double.parseDouble(item2_money);
        Double item3_Number = Double.parseDouble(item3_money);
        Double sumNum = Double.parseDouble(sum1);

        Double total = item1_Number + item2_Number + item3_Number;
        System.out.println("total: " + total);


        BigDecimal bd = new BigDecimal(total).setScale(2, RoundingMode.HALF_UP);
        double rounded = bd.doubleValue();
        System.out.println(rounded);




















    }
}
