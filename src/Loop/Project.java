package Loop;

import java.util.Scanner;

public class Project {
    public static void main(String[] args) {
//        Given a String, str2 , (str2 may contain characters, numbers and special characters) perform the following conditional actions:
//        Check if str2 has 3 or more characters, if less than 3 or bigger than 100 character, print only Invalid enter
//        Get only numbers from str2 and make one string then print (Hint: use charAt(), ASCII table to verify specific character is number or not number)



        Scanner input = new Scanner(System.in);
        String str1 = input.nextLine();

        int a = str1.length();

        if(str1.length()>3 || str1.length()<100) {
            System.out.println("invalid");}

        for(int i=0; i<a;i++) {
            if(a>3 || a<100)

            if(str1.charAt(i)>48 && str1.charAt(i)<57) {

            }











































        }


















    }




}
