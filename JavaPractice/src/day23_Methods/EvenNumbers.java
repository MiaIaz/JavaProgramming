package day23_Methods;

public class EvenNumbers {
    public static void main(String[] args) {

        evenNumbers();

    }

    public static void evenNumbers(){
        for (int i = 1; i <= 100 ; i++) {
            if(i%2 == 0){
                System.out.print(i+" ");
            }
        }

        System.out.println();
    }

}
/*
2. create a method that can print even numbers between 1~100 in a same line spread by space
 */