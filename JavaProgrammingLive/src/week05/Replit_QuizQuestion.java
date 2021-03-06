package week05;

import java.util.Scanner;

public class Replit_QuizQuestion {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("what is the farthest planet in the solar system:");
        System.out.println("a)venus");
        System.out.println("b)pluto");
        System.out.println("c)neptune");

        String result = scan.next();

        //your code
        switch (result){
            case"a":
                System.out.println("a is wrong");
                break;
            case"b":
                System.out.println("b is wrong");
                break;
            case"c":
                System.out.println("c is wrong");
                break;
            default:
                result="is not a valid answer";
                break;
        }
scan.close();
    }
}
/*In the given program you have a quiz question and a scanner to get the user input which will be stored on string **a**.

        after the user inputs an answer (a, b or c) we need to check if its the correct, wrong, or invalid answer.

        ```
        what is the farthest planet in the solar system:
        a)venus
        b)pluto
        c)neptune

        a

        a is wrong
        ```

        ```
        what is the farthest planet in the solar system:
        a)venus
        b)pluto
        c)neptune

        b

        b is correct
        ```

        ```
        what is the farthest planet in the solar system:
        a)venus
        b)pluto
        c)neptune

        c

        c is wrong
        ```

        ```
        what is the farthest planet in the solar system:
        a)venus
        b)pluto
        c)neptune

        z

        z is not a valid answer
        ```*/