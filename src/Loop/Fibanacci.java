package Loop;

import java.util.Scanner;

public class Fibanacci {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int numberInput = input.nextInt();
        int previous = 0;
        int next = 1;

//        the rule is xn = xn-1+xn-2  formula
        for(int i =1;i<=numberInput;i++) {
            System.out.println(previous + "");
            int sum = previous + next;
        }

        }



    }

