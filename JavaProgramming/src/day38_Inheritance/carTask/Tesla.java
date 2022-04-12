package day38_Inheritance.carTask;

public class Tesla extends Car{


    public Tesla(String model, String colour, double price, int year, int miles) {
        super("Tesla", model, colour, price, year, miles);
    }

    public void autoPilot(){
        System.out.println(brand+" "+model+" in autopilot mode");
    }

}
