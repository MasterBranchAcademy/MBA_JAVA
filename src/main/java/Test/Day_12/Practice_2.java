package Test.Day_12;

public class Practice_2 {
    public static void main(String[] args) {

        boolean devamDurumu = true;
        boolean dersDurumu  = true;

        boolean result = checkDiplomaEligibility(devamDurumu, dersDurumu);//true

        if(result){//true
            System.out.println("Diploma almaya hak kazandiniz!!!");
        }else{
            System.out.println("Malesef diploma almaya hak kazanamadiniz");
        }

    }

    public static boolean checkDiplomaEligibility(boolean devamDurumu, boolean dersDurumu){
                boolean result = devamDurumu && dersDurumu;// true && true = true
                return result;//true
    }
}
