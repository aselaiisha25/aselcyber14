package Loop;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        String pass = "secret478";
        Scanner input = new Scanner(System.in);
        int attempts = 0;

        for (; ; attempts++) {
            if(attempts==3){
            System.out.println("your account is locked");
            break;}

            System.out.println("enter a password");
        String userPass = input.nextLine();

        if (pass.equals(userPass)) {
            System.out.println("welcome to profile");
            break;
        }

    }

        }




    }

