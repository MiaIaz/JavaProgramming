package day40_ProtectedAccessModifier_FinalKeyword;

import day05_Concatenation.FullName;

public class FinalVariable {

    final String birthDay;
    final static String name;
    static {
        name = "Batch 08";
    }

    public FinalVariable(String birthDay) {
        this.birthDay = birthDay;
    }

    public static void main(String[] args) {

       final double pi = 3.14;

       // pi = 4.14;
       // pi = 5.3;

        final String name;
        name = "Java";

       // name = "Wooden Spoon";

        System.out.println(name);

        System.out.println("----------------------------------------[");

        FinalVariable obj = new FinalVariable("May/18");
        //obj.birthDay = "June/19"; //final variable can not be reassigned

        System.out.println(obj.birthDay);

        System.out.println("=========================================");


        System.out.println(FinalVariable.name);




    }
}