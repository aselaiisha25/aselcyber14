package String;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter 2 strings to comprare?");
        String word = input.nextLine();
        String word2 = input.nextLine();
        int compare = word.compareTo(word2);
        System.out.println(compare);

    }
}
