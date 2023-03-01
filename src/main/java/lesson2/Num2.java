package lesson2;
import java.util.Scanner;

public class Num2 {
    public static void main(String[] args) {
        System.out.println("the base triangle is defined with: \n 1) 3 sides \n 2) 2 sides and corner between them.");
        System.out.println("choose and write 1 or 2:");
        Scanner scanner = new Scanner(System.in);
        int type = scanner.nextInt();

        System.out.println("enter height of prism (int, >= 0):");
        int height = scanner.nextInt();

        if (type == 1) {
            System.out.println("enter the lengths of 3 sides (each on a new line, int, > 0):");
            int side1 = scanner.nextInt();
            int side2 = scanner.nextInt();
            int side3 = scanner.nextInt();
            Prism prism = new Prism(side1, side2, side3, height);
            System.out.println("So, volume of prism equals " + prism.volumeBy3Sides());
            System.out.println("and side area equals " + prism.areaSideBy3Sides());
        }
        else if (type == 2) {
            System.out.println("enter the lengths of 2 sides (each on a new line, int, > 0) and corner (int, in range (0, 180)): 2");
            int side1 = scanner.nextInt();
            int side2 = scanner.nextInt();
            float corner = scanner.nextFloat();
            Prism prism = new Prism(side1, side2, corner, height);
            System.out.println("So, volume of prism equals " + prism.volumeByCorner());
            System.out.println("and surface area equals " + prism.areaSideByCorner());
        }
        else {
            System.out.println("sorry, it is mistake(");
        }
    }
}
