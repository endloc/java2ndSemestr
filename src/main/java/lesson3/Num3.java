package lesson3;
import java.util.Arrays;

public class Num3 {
    public static void main (String[] args){
        Vector vector1 = new Vector(3, new int[] {1, 2, 3});
        System.out.println(Arrays.toString(vector1.additionVector(new int[]{2, 3, 4})));
        System.out.println(Arrays.toString(vector1.substractionVector(new int[] {1, 2, 3})));
        System.out.println(Arrays.toString(vector1.scalarProduct(new int[] {1, 2, 4})));

    }
}
