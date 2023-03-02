package lesson2;

import java.util.Scanner;

public class Num4Fibonacci {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        long temp = scanner.nextLong();
        if (temp < 0) {
            System.out.println("error: negative number!");
            return;
        }
        if (temp == 1 || temp == 0) {
            System.out.println("it is Fibonacci number.");
            return;
        }

        long lastNumber = 1, curNumber = 1, counter = 2;
        while (temp > curNumber) {
            long helper = curNumber;
            curNumber += lastNumber;
            lastNumber = helper;
            counter += 1;
            if (curNumber == temp) {
                System.out.println(temp + "is № " + counter + " Fibonacci number!");
                return;
            }
        }

        System.out.println(temp + " is not Fibonacci number(");

    }
}
