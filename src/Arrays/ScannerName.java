package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ScannerName {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("how many times do you want to enter");
        int size = input.nextInt();
        input.nextLine();
        String []names = new String[5];

        for(int i=0;i<names.length;i++) {
            System.out.println("enter a name" + (i+1));
            names[i] =input.nextLine();
            System.out.println(Arrays.toString(names));}


        }
        }






