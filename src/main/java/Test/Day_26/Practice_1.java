package Test.Day_26;

public class Practice_1 {
    public static void main(String[] args) {


        String [] dashboard = {"Tum","gunun teklifleri","musteri servisi","istek listesi", "hediye kartlari","Amazonda satis yapin"};

        String boyut = (dashboard.length==6)?"dashboard'un boyutu 6":"dashboard'un boyutu 6 degil";
        System.out.println("boyut : " + boyut);

        boolean flag = false;
        for (String eleman:dashboard) {
            if(eleman.equals("istek listesi")){
                flag =true;
                break;
            }
        }

        String istekListesi = (flag)?"istek listesi bulundu":"istek listesi bulunamadi";
        System.out.println("istekListesi : " + istekListesi);











    }
}
