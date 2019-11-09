package Voidmethhod;

public class EvenNUmbers {
    public static void main(String[] args) {
        int [] arr = {2,4,5,6,7,8,9};
        System.out.println(countEvenNumbers(arr));




    }
    public static int countEvenNumbers(int [] values) {
        int countEven = 0;
        for(int num:values) {
            if (num % 2 == 0) {
                countEven++;
            }
        }
        return countEven;







            }
        }





