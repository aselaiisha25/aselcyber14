package Arrays;

public class MaxNumber {
    public static void main(String[] args) {

        int[]numbers = {3,30,14,6,50,20};
        int max = numbers[0];

        for(int i=1;i<numbers.length;i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println(max);
            }
        }





