package Test.Day_24;

public class Practice_5 {
    public static void main(String[] args) {

        String [] [] calisanBilgileri = {
                {"TAKIMLAR","Galibiyet", "Beraberlik","Atilan gol","Yenilen gol","Averaj", "Puan"},
                {"Galatasaray","18","3","5","52","19","33","57"},
                {"Besiktas","17","3","5","56","26","30","54"},
                {"Fenerbahce","16","3","6","47","27","20","51"},
                {"Trabzonspor","14","6","5","32","24","8","48"}
        };

        int index =0;
        for (String[] satirlar:calisanBilgileri) {
            if(index ==1 || index == 3){
                System.out.println(satirlar[satirlar.length - 1]);
            }
            index++;
        }

    }
}
