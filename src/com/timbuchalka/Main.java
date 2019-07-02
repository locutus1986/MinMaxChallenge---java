package com.timbuchalka;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int minNumber = Integer.MAX_VALUE;
        int maxNumber = Integer.MIN_VALUE;

        while(true){

            System.out.println("Enter Number: ");
            Boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                int number = scanner.nextInt();

                if (number < minNumber) {
                    minNumber = number;
                }
                if (number > maxNumber) {
                    maxNumber = number;
                }

            }else {
                break;
            }


            scanner.nextLine();
        }

        System.out.println("The min number was: " + minNumber + " and the max number was: " + maxNumber);

        scanner.close();
    }
}
