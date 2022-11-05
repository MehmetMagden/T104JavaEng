package day27_ImmutableAndDateTime;

public class C03_StringPool {

    public static void main(String[] args) {

        String str1 = "Java";
        String str2 = "Java";

        String str3 = new String("Java");

        String str4 ="";
        str4 = str4.concat("Java");

        String str5 = "Ja";
        str5=str5.concat("va");


        System.out.println(str1.equals(str2));  //true
        System.out.println(str1==str2);  //true
        System.out.println("----");
        System.out.println(str1.equals(str3)); //true
        System.out.println(str1==str3); // false
        System.out.println("----");
        System.out.println(str1.equals(str4)); // true
        System.out.println(str1==str4); // false
        System.out.println(str1.equals(str5)); // true
        System.out.println(str1==str5); // false

    }


}
