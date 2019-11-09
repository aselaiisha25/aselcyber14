package Voidmethhod;

import java.util.Scanner;

public class TwoStrings {
    public static void main(String[] args) {
        stringContains("i am an agent","t");



    }






public static void stringContains(String str,String str2) {
    if(str.contains(str2)) {
        str.replace(str2,"");
        System.out.println(str.trim()); }
    else {
        System.out.println("try again");
        Scanner input = new Scanner(System.in);
        String again = input.nextLine();

        if(str.contains(again)) {

        } else {
            System.out.println("out of tries"); }
        }
    }



}



