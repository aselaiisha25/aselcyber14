package Arrays;

import java.util.Arrays;

public class NumberArray {
    public static void main(String[] args) {
        int[] number = {4,-2,5,-3,-20,30};

        for(int i=0;i< number.length;i++) {
            if (number[i] < 0) {
                number[i] = 0;
            }
        }

            System.out.println(Arrays.toString(number));
        }


    }

