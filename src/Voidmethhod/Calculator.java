package Voidmethhod;

public class Calculator {
    public static void main(String[] args) {
        System.out.println(calculator("%",15,3));

    }


    public static double calculator(String op,double one,double two ) {
        switch(op) {
            case"+":
                return one+two;
            case"-":
                return one-two;
            case"*":
                return one*two;
            case "/":
                return one/two;
            case "%":
                return one%two;
            default:
                System.out.println("invalid operator");
                return 0;

        }
    }

}
