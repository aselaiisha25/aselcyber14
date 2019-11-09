package Voidmethhod;

import java.util.Arrays;

public class ReplacNegati {
    public static void main(String[] args) {
        int [] arr2={3,5,7-2,-5,-5,9};
        replNegNum(arr2,100);


    }

    public static void replNegNum(int [] arr,int change) {
        for(int i =0;i<arr.length;i++) {
            if(arr[i] <0) {
                arr[i] = change;
            }}
        System.out.println(Arrays.toString(arr));


            }
        }




