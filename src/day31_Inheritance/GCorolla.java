package day31_Inheritance;

public class GCorolla extends FToyota {

    GCorolla (){
        super();
        System.out.println("GCorolla cons ran");
    }

    String model = "Corolla";
    String madeIn = "Turkey";

    public static void main(String[] args) {

        GCorolla corolla1 = new GCorolla();
        System.out.println(corolla1.brand);


    }

}
