package Arrays;

import java.util.Arrays;
import java.util.Random;

public class RAndomL {
    public static void main(String[] args) {
        Random random = new Random();
        int [] arr = new int[50];

        for(int i = 0;i<arr.length; i++) {
            int num = random.nextInt(100) + 1;
            arr[i] = num;
        }
        System.out.println(Arrays.toString(arr));




        }




    }

