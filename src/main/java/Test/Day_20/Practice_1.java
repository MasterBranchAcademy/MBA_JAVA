package Test.Day_20;

public class Practice_1 {
    public static void main(String[] args) {

        //replace()

        String text = "Hello world!";

        String updatedText = text.replace("world","Saturn");

        //System.out.println("updatedText : " + updatedText);



        //trim()

        String metin_web = "    500 results found ";
        String metin_api = "500 results found";

        if(metin_web.trim().equals(metin_api)){
            //System.out.println("Esittir");
        }else{
            //System.out.println("Esit degil");
        }

        //startsWith() -> true false

        String text_1 = "Hello world! ";

        if(text_1.startsWith("Hel")){
            //System.out.println("Yes");
        }else{
            //System.out.println("No");
        }

        if(text_1.endsWith("lo world! ")){
            //System.out.println("Yes");
        }else{
            //System.out.println("No");
        }

        // Character

        String text_2 = "     Hello world! ";
        int counter = 0;

        for (int i = 0; i <text_2.length() ; i++) {
            char karakter = text_2.charAt(i);//0
            System.out.println("karakter : " +karakter);//Hello

            if(Character.isWhitespace(karakter)){//Hello
                counter++;
            }
        }

        System.out.println("counter : " + counter);

















    }
}
