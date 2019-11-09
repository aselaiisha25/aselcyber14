package Arrays;

import java.util.Arrays;

public class AddTWoArrays {
    public static void main(String[] args) {

        int[] sum1 = {3,6,5,20,5};
        int[] sum2 = {2,7,-10,10,-5};
        int[]sum = new int[sum1.length];

         for(int i=0;i<sum1.length;i++) {

             sum[i] = sum1[i] + sum2[i];
         }
        System.out.println(Arrays.toString(sum));
        System.out.println("java is fun");

         }



    }



