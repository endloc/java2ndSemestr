package lesson3;
import java.util.Arrays;


public class Num2 {
    public static void main(String[] args) {
        // важно: передача массива в конструктор
//        Strings array1 = new Strings(5, new String[] {"123", "2", "890", "4", "123", "91019171"});
        Strings array1 = new Strings(7, new String[] {"123", "2", "890", "4", "123", "91019171", "2299"});
//        Strings array1 = new Strings(0, new String[] {});

        array1.addElement("1234567");
        array1.addElement("123456");
        array1.addElement("1");
        array1.addElement("12");

        System.out.println(Arrays.toString(array1.getStrings()));
        System.out.println(array1.maxElementFind());
//        array1.averageElementLength();
        System.out.println(array1.averageElementLength());

        System.out.println("~~~~~~~~~");

        Strings array2 = new Strings(-5, new String[] {"1", "2", "3", "4", "55"});

        array2.addElement("1234567");

        System.out.println(Arrays.toString(array2.getStrings()));
        System.out.println(array2.maxElementFind());
        System.out.println(array2.averageElementLength());
    }
}
