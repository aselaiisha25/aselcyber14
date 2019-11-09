package String;

import java.util.Scanner;

public class Example7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();

        String checked = name;

         checked = checked.replace("idiot","smart");
        checked = checked.replace("dumb","smart");
        checked = checked.replace("stupid","smart");
    if(name.equalsIgnoreCase(checked)) {
        System.out.println("your message was not changed");
        System.out.println(name);}
    else {
        System.out.println("bad words removed");
        System.out.println(checked);}





        }


    }


