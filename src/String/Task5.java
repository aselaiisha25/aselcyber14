package String;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("enter your account number ");
//        String num = input.nextLine();
//        String firstNumber = num.substring(0,1);
//
//        boolean  invalid = !firstNumber.equals("5") || !firstNumber.equals("2");
//
//        if(invalid) {
//            System.out.println("Invalid account number");
//        } else {
//            if(firstNumber.equals("5") &&  num.length() == 10) {
//                System.out.println("valid 5 account");
//            } else
//            }
//        }
        Scanner s = new Scanner(System.in);
        String txt = s.next();
        char txt1 = txt.charAt(5);
        System.out.print(txt1);
        char txt2 = txt.charAt(6);
        System.out.print(txt2);
        char txt3 = txt.charAt(6);
        System.out.println(txt3);


    }
}
