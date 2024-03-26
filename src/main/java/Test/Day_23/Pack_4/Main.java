package Test.Day_23.Pack_4;

public class Main {
    public static void main(String[] args) {

        int [] arrayList = arrayOlustur(2,3,4,5,6);

        for (int i = 0; i < arrayList.length; i++) {
            System.out.println(arrayList[i]);
        }
    }

public static int[] arrayOlustur(int num1, int num2, int num3, int num4, int num5){
        int [] array = {num1, num2, num3, num4, num5};
        return array;
}


}
