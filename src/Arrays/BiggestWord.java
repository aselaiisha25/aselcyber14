package Arrays;

import java.util.Arrays;

public class BiggestWord {
    public static void main(String[] args) {

        String  str ="Write a program that create a group of given size thisisabigword";

        String [] arr = str.trim().split("");
        int biggestlentgh = 0;

        for(String word:arr) {
            if (word.length() > biggestlentgh) {
                biggestlentgh = word.length();
            }
        }
        for(String word:arr) {
            if (word.length() == biggestlentgh) {
                System.out.print(word);
            }
        }
            }
        }










