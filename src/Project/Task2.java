package Project;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfCall;
        double bill=0.0;
        System.out.println("Enter number of calls:");
        numberOfCall = input.nextInt();
        if (numberOfCall <= 100)
        {
            bill = 200;
        }
        else if (numberOfCall > 100 && numberOfCall <= 150)
        {
            numberOfCall = numberOfCall - 100;
            bill = 200+(0.60 * numberOfCall);
        }
        else if (numberOfCall > 150 && numberOfCall <= 200)
        {
            numberOfCall = numberOfCall - 150;
            bill = 200+(0.60 *50) + (0.50 * numberOfCall);
        }
        else
        {
            numberOfCall = numberOfCall - 200;
            bill = 200 + (0.60 * 50) + (0.50 * 50) + (0.40 * numberOfCall);
        }
        System.out.println("Your bill is "+bill);





    }
}
