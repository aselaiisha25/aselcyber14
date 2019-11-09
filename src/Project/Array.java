package Project;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter word: ");
        String str=input.nextLine();
        int len=str.length();
        int c=len/2;
        char ch[]=str.toCharArray();
        System.out.println("Middle Character is: "+ch[c]);

    }
}

