package lesson2;
import java.util.Scanner;
import java.util.ArrayList;
public class Num1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number (in range (-2147483648, 2147483648)): ");
        int number = scanner.nextInt();
        int numberFix = number, currentDiv = 2;
        ArrayList<Integer> dividers = new ArrayList<>();

        while (number % 2 == 0) {
            dividers.add(2);
            number /= 2;
        }
        currentDiv++;

        while (Math.pow(currentDiv, 2) <= numberFix) {
            if (number % currentDiv == 0) {
                while (number % currentDiv == 0) {
                    dividers.add(currentDiv);
                    number /= currentDiv;
                }
            }
            currentDiv += 2;
        }
        if (dividers.size() == 0) {
            if (numberFix == 1) {
                System.out.println("Your number is 'one'. It has only one div: 1.");
            } else {
                System.out.println("Your number is simple. It has only two divs: 1 and " + numberFix + ".");
            }
        } else {
            System.out.println("Divs of number " + numberFix + ": " + dividers);
        }
    }
}

