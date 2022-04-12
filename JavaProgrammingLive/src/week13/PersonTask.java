package week13;

public class PersonTask {

    public static void main(String[] args) {

        Person person1 = new Person("Mia", "Stan", 33);
        System.out.println("person1 = " + person1);

        //can I change the person name?

        person1.setLastName("Iaz");
        System.out.println("person1 = " + person1);


    }
}
