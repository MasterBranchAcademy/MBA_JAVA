package Test.Day_27;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Practice_6 {
    public static void main(String[] args) {

        String item1 = "$54.95";
        String item2= "$129.95";
        String item3 = "$2996.95";
        String sum = "$3181.85";

        String item1_money = item1.replace("$","");
        String item2_money = item2.replace("$","");
        String item3_money = item3.replace("$","");
        String sum1 = sum.replace("$","");

        Double item1_Number = Double.parseDouble(item1_money);
        Double item2_Number = Double.parseDouble(item2_money);
        Double item3_Number = Double.parseDouble(item3_money);
        Double sumNum = Double.parseDouble(sum1);

        Double total = item1_Number + item2_Number + item3_Number;
        System.out.println("total: " + total);


        String formatted = String.format("%.1f", total);
        System.out.println(formatted);













    }
}
