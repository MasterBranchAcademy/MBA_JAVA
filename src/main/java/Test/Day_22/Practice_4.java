package Test.Day_22;

public class Practice_4 {
    public static void main(String[] args) {

        int [] numbers = {12, 13, 14, 15, 16, 17, 18, 19, 20, 21};

        for (int i = 0; i < numbers.length; i++) {// 0 1 2 3 4     9
            numbers[i] = numbers[i] + 5;
        }

        System.out.println("//////////////////");

        for (int number: numbers) {
            System.out.println(number);
        }













    }
}
