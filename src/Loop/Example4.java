package Loop;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {


    Scanner input =new Scanner(System.in);
    int balance = 1500;
    int transBal;
    int dec = 0;

    while (balance > 0) {
        System.out.println("enter the transaction amount");
        transBal = input.nextInt();

        if(transBal <= balance) {
            System.out.println("item purchased");
            balance-=transBal;}
        else {
            System.out.println("card declined");
            dec++;}
        if(dec==3) {
            System.out.println("card is locked");
            break;}
        if(balance==0) {
            System.out.println("broke");}

        }

        }
    }









