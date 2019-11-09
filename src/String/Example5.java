package String;

import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your name?");
       String name = input.nextLine().toLowerCase();

    if(name.charAt(0) == 'a'|| name.charAt(0) == 'z') {
        System.out.println("cool name");}
    else {
        System.out.println("not cool");}
    }






    }

