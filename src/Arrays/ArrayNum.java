package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayNum {
    public static void main(String[] args) {
        int[] array = {1, 2, -3, 4, -34, 55, 78, 90, 33, 10};
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                counter++;
            }

        }
        int[] evenNumbers = new int[counter];

        for (int i = 0, j = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evenNumbers[j] = array[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(evenNumbers));



    }
        }





