package Voidmethhod;

import java.util.Arrays;

public class biggestSMallestString {
    public static void main(String[] args) {
        System.out.println(diffFromString("475634875634"));
    }


    public static int diffFromString(String number) {

        String[] arr = number.split("");
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        return Integer.valueOf(arr[arr.length - 1]) - Integer.valueOf(arr[0]);

    }
}
