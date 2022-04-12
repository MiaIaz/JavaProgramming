package day38_Inheritance.carTask;

public class Toyota extends Car{

    public Toyota(String model, String colour, double price, int year, int miles) {
        super("Toyota", model, colour, price, year, miles);
    }

    public void reliable(){
        System.out.println(brand + " " + model + " is reliable");
    }

}
