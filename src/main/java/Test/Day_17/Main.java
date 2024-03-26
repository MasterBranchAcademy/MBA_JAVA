package Test.Day_17;

public class Main {
    public static void main(String[] args) {

        String text = "Hello world!";
                    // 01234567891011
        String text_1 = "";
                   // 0

        //System.out.println("text_1 : " + text_1);

        //isEmpty() = true/false

        System.out.println(text.isEmpty());
        System.out.println(text_1.isEmpty());

        //indexOf(String str)

        System.out.println(text.indexOf("w"));
        System.out.println(text.indexOf("p"));


        //indexOf(String str, int num)
        System.out.println(text.indexOf("o", 5));


        //lastIndexOf()
        System.out.println(text.lastIndexOf("o"));

        //length()
        System.out.println(text.length());

        //toUppurCase()

        System.out.println(text.toUpperCase());

        //toLowerCase()

        System.out.println(text.toLowerCase());


        //concat()
        String str1 = "test ";
        String str2 = " QA";

        String metin = str1.concat(str2);

        System.out.println("metin :" + metin );



















    }
}
