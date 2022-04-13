package day39_Recap.cydeoTask;

import day38_Inheritance.carTask.Tesla;

public class Cydeo {
    public static void main(String[] args) {
        Developer developer = new Developer("Muhtar", 37, 'M', 352, "SDET", 78098);

        Tester tester = new Tester("Asya", 36, 'F', 278, "Scrum Master", 49869);

        Teacher teacher = new Teacher("Oscar", 48, 'M', 786, "Java instructor", 69089);

        Student student = new Student("Mia", 33, 'F', 1879, "SoftSkills");

        System.out.println("developer = " + developer);
        System.out.println("tester = " + tester);
        System.out.println("teacher = " + teacher);
        System.out.println("student = " + student);

        System.out.println("====================================");

        developer.setAge(45);

        System.out.println(developer.getAge());
        System.out.println(developer);

        System.out.println("====================================");

        developer.work();
        tester.work();
        teacher.work();
       // student.work();

        System.out.println("====================================");

        developer.eat();
        developer.drink();
        developer.sleep();

        developer.fixingBugs();

        System.out.println("====================================");

        tester.eat();
        tester.drink();
        tester.sleep();

        tester.creatTicket();

        System.out.println("====================================");

        teacher.eat();
        teacher.drink();
        teacher.sleep();

        System.out.println("====================================");

        student.eat();
        student.drink();
        student.sleep();

        student.study();




    }
}
