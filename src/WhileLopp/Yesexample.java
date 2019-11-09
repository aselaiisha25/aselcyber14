package WhileLopp;

import java.util.Scanner;

public class Yesexample {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("would you like to add 1?");
        String user = input.nextLine();
        int n = 0;


        while (user.equals("y") || user.equals("yes")) {
            n++;
            System.out.println("would you like to add 1");
            user = input.nextLine(); }

            System.out.println("your number is "+ n);




        }

    }

