package WhileLopp;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter you address");
        String address = input.nextLine();
        int count = 0;
        while(address.contains("il")) {
            count++;

            System.out.println("enter your address");
            address = input.nextLine();
        }
        System.out.println(count);


    }
}
