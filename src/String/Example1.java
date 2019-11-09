package String;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        String name = "Cybertek is located in Des Plaines";
        Scanner input = new Scanner (System.in);
        String name1 = input.nextLine();
        int from = name.indexOf(name1);
        System.out.println(from);


    }
}
