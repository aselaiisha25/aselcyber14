package Voidmethhod;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class countWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter some string");
        String str = input.nextLine();

        countWords(str);
    }
    public static void countWords (String str){
            String[] arr = str.trim().split(" ");
            System.out.println("The number of words in the sentence is " + arr.length);

        }



}
