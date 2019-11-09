package DoooLoop;

import java.util.Random;
import java.util.Scanner;

public class RandomNu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int guessrnumber = random.nextInt(100)+1;
       int guess = 0;
       int count=0;


do {
    System.out.println("enter a guest");
    guess = input.nextInt();
    count++;
    if (guess < guessrnumber) {
        System.out.println("too low");
    } else if (guess > guessrnumber) {
        System.out.println("too high");
    } else {
        System.out.println("you guessed right after" + count + "tries");
    }

} while (guessrnumber!=guess);



}

    }

