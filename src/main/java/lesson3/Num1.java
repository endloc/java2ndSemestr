package lesson3;

import java.util.Scanner;

public class Num1 {
    public static void main(String args[]) {

        Dot dot1 = new Dot(22.5, 89.);
        Dot dot2 = new Dot(144., -72.);
        Dot dot3 = new Dot(123.456, -72.98);

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("coordinates of point#1 (each on a new line):");
//        double x1 = scanner.nextDouble();
//        double y1 = scanner.nextDouble();
////        String coord1Line = scanner.nextLine();
////        String[] coord1LineM = coord1Line.split(" ");
////        double[] coord1Num = new double[coord1LineM.lenght];
//        System.out.println("coordinates of point#2 (each on a new line):");
//        double x2 = scanner.nextDouble();
//        double y2 = scanner.nextDouble();

        System.out.println(dot1.distanceTo(dot2) + "\n");

//        System.out.println("coordinates of point#3 (each on a new line):");
//        double x3 = scanner.nextDouble();
//        double y3 = scanner.nextDouble();
//
//        Dot dot3 = new Dot(x3, y3);

        System.out.println(dot3.toString() + "\n");

    }
}
