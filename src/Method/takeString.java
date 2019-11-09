package Method;


import java.util.Scanner;

public class takeString {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("would u like to add 1? ");
        String name= input.nextLine();
       int count=0;

        while (name.contains("yes") ||  name.contains("y")) {
            count++;
            System.out.println("would you like to add 1");
            name = input.nextLine();
            if(name.contains("no") || name.contains("n")) {
                System.out.println("you number is " + count);}

            }




        }



    }










