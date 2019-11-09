package Voidmethhod;

public class NegativeNUm {
    public static void main(String[] args) {
        int[]arr ={-1,3,-4,-2,32,2,-23};
        negativeNum(arr);

    }


    public static void negativeNum(int [] arr) {
        for(int num: arr) {
            if(num<0) {
                System.out.println(num);}
        }

        }


    }


