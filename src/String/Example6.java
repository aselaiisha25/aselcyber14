package String;

import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        String  cars = "Toyota, BMW, Juguar,Nissan,Maserati,Jaguar";
        cars = cars.toLowerCase();

        if (cars.isEmpty()) {
            System.out.println("No cars in your garage");}
        if(cars.contains("toyota") || cars.contains("nissan")) {
            System.out.println("there is a japanese car ");}
        else {
            System.out.println("ther is no japanese car"); }
        if(cars.contains("bmw")) {
            System.out.println("there is a germany car");}
        else {
            System.out.println("there is no germany car");

        }

        }

        }


