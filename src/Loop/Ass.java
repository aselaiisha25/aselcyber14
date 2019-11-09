package Loop;

import java.util.Scanner;

public class Ass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
//        System.out.println("Enter any positive integer:");
//        int num1 = input.nextInt();
//
//        for(int i =0;i<10;i++) {
//            System.out.println(num1 + " x " + (i+1) +  " = "+ (num1*(i+1)));}


        if(n % 2== 1) {
            System.out.println("weird");}
        else if(n%2==0 && n>2 && n<5) {
            System.out.println("not weird");}
        else if(n%2==0 && n>6 && n<20) {
            System.out.println("weird");}
        else if(n%2==0 && n>20) {
            System.out.println("weird");}

    }
}












