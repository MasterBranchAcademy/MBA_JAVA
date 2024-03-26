package Test.Day_22;

public class Practice_6 {
    public static void main(String[] args) {

        int [] numbers_1 = {10,20, 30, 40, 50 ,60, 70, 80, 90, 100};//10
        int [] numbers_2 = {10,20, 30, 40, 50 ,60, 70, 80, 90, 100, 12};//10

        boolean statu = true;
        int i = 0;

        if(numbers_1.length != numbers_2.length){
            System.out.println("Arraylerin uzunlugu farkli");
            statu= false;
        }else{
            for (int num1: numbers_1) {
                if(num1 != numbers_2[i]){//0 1 2 3 4 .... 9
                    statu = false;
                    break;
                }
                i++;
            }
        }

        if(statu){
            System.out.println("Array ler esittir");
        }else{
            System.out.println("Array ler farklidir");
        }













    }
}
