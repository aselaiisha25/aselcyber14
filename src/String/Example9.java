package String;

import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter two strings");
        String name1 = input.nextLine();
        String name2 = input.nextLine();
        String email = "";

        if(name1.length()>= 6 && name2.length()>=6) {
            email = name1.substring(0,4) .toLowerCase();
            email += name2.substring(name2.length() - 3);
            email += "@cybertek.com";
            System.out.println(email);}
            else {
            System.out.println("Invalid data");}
        }
    }

