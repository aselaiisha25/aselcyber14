package String;

import java.util.Scanner;

public class Picnic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word1 = "We will have a picnic when th weather gets nicer";
        System.out.println(word1);
        System.out.println("What do you want to change?");
        String change = input.nextLine();
        System.out.println("What do you want to change that to?");
        String replace = input.nextLine();
        String result = word1.replace(change,replace);
        System.out.println(result);




    }
}
