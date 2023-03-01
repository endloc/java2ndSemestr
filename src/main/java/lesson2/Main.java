package lesson2;

// решение кубического уравнения [ x^3 + x + 1 = 0 ]
// (по формуле Кардано)
public class Main {
    public static void main(String[] args) {
        // перед нами уравнение вида [ x^3 + px + q = 0 ]
        double p = 1., q = 1.;
        double Q = Math.pow(p / 3, 3) + Math.pow(q / 2, 2);
        System.out.println(Q);
        double firstPart = Math.cbrt((-q) / 2.0 + Math.sqrt(Q));
        System.out.println(firstPart);
        double secondPart = Math.cbrt((-q) / 2.0 - Math.sqrt(Q));
        System.out.println(secondPart);
        double answer = firstPart + secondPart;
        System.out.println("Корень кубического уравнения [ x^3 + x + 1 = 0 ]:");
        System.out.println("answer = " + answer);
    }
}