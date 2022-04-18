package day41_Exceptions;

import day39_Recap.cydeoTask.Student;

import java.io.FileInputStream;

public class Checked_VS_Unchecked {

    public static void main(String[] args) {

        //unchecked exceptions:

        int a = 10;
        int b = 0;

     //   System.out.println(a/b);

        char[] characters = {'A', 'B', 'C',};
        //                    0,   1,   2
    //    System.out.println(characters[99]);

        Student student = null;
        System.out.println(student.getName());

        System.out.println("===========================================");

        // checked Exceptions:


        System.out.println("Hello");

       //  Thread.sleep(3000);

        System.out.println("Cydeo");

        // FileInputStream file = new FileInputStream("path of the file");


    }


}
