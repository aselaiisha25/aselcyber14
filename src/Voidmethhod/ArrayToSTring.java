package Voidmethhod;

import java.util.Arrays;

public class ArrayToSTring {
    public static void main(String[] args) {
        int [] array2={2,4,5,9,-6,8};
        System.out.println(Arrays.toString(array2));




    }


    public static void ArrayMethod (int [] arr) {
        String result ="[";

        for(int num:arr) {
            result+=num+", ";
            result=result.trim().substring(0,result.length()-2)+"]";
            System.out.println(result);


        }







    }



}
