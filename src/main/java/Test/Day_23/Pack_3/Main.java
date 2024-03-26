package Test.Day_23.Pack_3;

public class Main {
    public static void main(String[] args) {

        int [] array_1 = {10,20,30};
        int [] array_2 = {40,50,60};

        int toplam = toplam(array_1, array_2);
        System.out.println("toplam : " + toplam);


    }

public static int toplam(int [] array_1, int [] array_2){
        int toplam = array_1[0] + array_2[0];
        return toplam;
}



}
