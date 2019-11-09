package String;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter a sentence");
        String sentence = input.nextLine();


        int space = sentence.indexOf (" ");
        String firstWord = sentence.substring(0,space);
        String remain = sentence.substring(space +1);
        System.out.println(remain + " " + firstWord);







    }

}
