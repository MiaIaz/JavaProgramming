package day38_Inheritance.carTask;

public class Car {

    public String brand, model, colour;
    public double price;
    public int year, miles;

    public Car(String brand, String model, String colour, double price, int year, int miles) {
        this.brand = brand;
        this.model = model;
        this.colour = colour;
        this.price = price;
        this.year = year;
        this.miles = miles;
    }


    public void start (){
        System.out.println(brand + " " + model + " is starting");
    }

    public void drive (){
        System.out.println(brand + " " + model + " is driving");
    }

    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", colour='" + colour + '\'' +
                ", price= £" + price +
                ", year=" + year +
                ", miles=" + miles +
                '}';
    }
}