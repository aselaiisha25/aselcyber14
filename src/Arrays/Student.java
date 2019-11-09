package Arrays;

import java.util.Scanner;

public class Student {
    public static void main(String[] args) {


        String[] students = {"james", "sam", "adam", "elize", "jamie", "benzema", "sandy"};


        for (int i = 0; i < students.length; i++) {
            int last = students[i].length() - 1;
            System.out.println(students[i].charAt(last));
        }
        for(int i=0; i<students.length; i++) {
            if(students[i].toLowerCase().endsWith("s")) {
                System.out.println(students[i]); }}

            System.out.println();
            for(int i=0; i < students.length;i++) {
                if(students[i].toLowerCase().contains("s")) {
                    System.out.println(students[i]);
                } }
                System.out.println();
                System.out.println("enter a string");
                Scanner input= new Scanner(System.in);

                String name = input.nextLine();


                for (int i=0; i < students.length; i++) {
                    if(students[i].toLowerCase().contains(name) ) {
                        System.out.println(students[i]);
                    }}
                    }

                    }











