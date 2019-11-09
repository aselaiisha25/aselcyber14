package Loop;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (; ;) {
            String user = input.nextLine();
            if(user.equalsIgnoreCase("hi")) {
                System.out.println("hello");}

            else if (user.equalsIgnoreCase("bye")) {
                System.out.println("goodbye");}
            else {
                System.out.println("bye forever");}

            }
        }
    }

