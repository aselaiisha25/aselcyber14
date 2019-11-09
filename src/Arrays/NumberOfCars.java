package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class NumberOfCars {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter number of cars");
        int size = input.nextInt();
        input.nextLine();

        String [] cars = new String[size];


      for(int i=0;i<cars.length;i++) {

          System.out.println("Enter car" + (i + 1));
          String car1 = input.nextLine();
          cars[i] = car1;
      }
        System.out.println(Arrays.toString(cars));



      }







    }

