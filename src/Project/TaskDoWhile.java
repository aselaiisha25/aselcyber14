package Project;

import java.util.Scanner;

public class TaskDoWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String answer= "";
        String yes = "y";
        int number= 0;
        int negative = 0;
        int positive = 0;
        int zero= 0;
        do{
            System.out.println("Enter the number: ");
            number=input.nextInt();
            input.nextLine();
            System.out.println("Do you want to continue y/n?");
            answer=input.nextLine();
            if(number==0){
                zero++;
            }
            else if(number>0){
                positive++;
            }
            else if(number<0){
                negative++;
            }
        }while(answer.equalsIgnoreCase("y"));
        System.out.println("Positive numbers: "+positive );
        System.out.println("Negative number: "+negative);
        System.out.println("Zero numbers: "+zero);










    }








}
