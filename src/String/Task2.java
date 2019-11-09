package String;

import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();
        String message = input.nextLine();
        if(message.length() >= 15) {
            System.out.println("message was sent");
            int num = random.nextInt(10);

            if(num % 2 == 1) {
                System.out.println("message delivered");
            } else {
                System.out.println("message too short.message not sent");}



            }



        }



    }

