package Test.Day_27;

public class Practice_4 {
    public static void main(String[] args) {

        String shirt = "$20";
        String shorts= "$30";
        String shoes = "$30";
        String sum = "$80";

        String shirt1 = shirt.replace("$","");//"20"
        String shorts1 = shorts.replace("$","");//"30"
        String shoes1 = shoes.replace("$","");//"30"
        String sum1 = sum.replace("$","");//"80"

        Integer shirtNum = Integer.parseInt(shirt1);
        Integer shortsNum = Integer.parseInt(shorts1);
        Integer shoesNum = Integer.parseInt(shoes1);
        Integer sumNum = Integer.parseInt(sum1);

        Integer total = shirtNum + shortsNum + shoesNum;
        System.out.println("total: " + total);

        if(total == sumNum){
            System.out.println("islem dogru");
        }else{
            System.out.println("islem yanlis");
        }
















    }
}
