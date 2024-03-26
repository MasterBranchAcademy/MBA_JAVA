package Test.Day_23.Pack_1;

public class Main {
    public static void main(String[] args) {

        int [] arraylist = {1,2,3,4,5};

        int ilkEleman = ilkIntElemaniDondur(arraylist);
        System.out.println("ilkEleman : " + ilkEleman);

    }

    public static int ilkIntElemaniDondur(int [] arrayList){
        int ilkEleman = arrayList[0];
        return ilkEleman;
    }


}
