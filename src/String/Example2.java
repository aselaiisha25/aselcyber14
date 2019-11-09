package String;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String month = "october";
        System.out.println("please enter a month");
        String user = input.nextLine();

        if(user.equalsIgnoreCase(month)) {
            System.out.println("true");}
            else {
            System.out.println("false");}
        }

    }

