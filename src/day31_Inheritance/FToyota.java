package day31_Inheritance;

public class FToyota extends ECars{

    FToyota(){
        super();
        System.out.println("FToyota cons ran");
    }

    protected String brand = " Toyota";
    protected  String motor = "Good Motor";
    protected String color = "color is not assigned ";
    protected String madeIn =" not assigned";
    protected int speed = 130;



}
