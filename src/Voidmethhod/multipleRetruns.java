package Voidmethhod;

public class multipleRetruns {

    public static  int checkNumber(int num) {

        if(num<0) {
            return 0;}
        else {
            return num +1; }

    }

    public static void main(String[] args) {
        System.out.println("Negative number " + checkNumber(-4));
        System.out.println("Positive number " + checkNumber(4));

    }

}
