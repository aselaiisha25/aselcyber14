package Voidmethhod;

import java.util.Arrays;

public class addNUmTOString {
    public static void main(String[] args) {
        addNumToString("958473",1);


    }


    public static void addNumToString(String number,int add) {
        String [] num = number.split("");
        int[] intArray = new int[num.length];

        for(int i=0;i<num.length;i++) {
            intArray[i] = Integer.valueOf(num[i]) + add;
        }
        System.out.println(Arrays.toString(intArray));
        }


    }

