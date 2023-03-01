package lesson2;

// призма: стороны треугольника и высота призмы
public class Prism {
    private int sideA;
    private int sideB;
    private int sideC;
    private int height;
    private float corner;

    public Prism(int sideA, int sideB, int sideC, int height) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.height = height;
    }
    public Prism(int sideA, int sideB, float corner, int height) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.corner = corner;
        this.height = height;
    }
    public String volumeBy3Sides() {
        double p = (sideA + sideB + sideC) / 2.;
        double v = Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC)) * height;
        String result = String.format("%.2f",v);
        return result;
    }
    public String areaSideBy3Sides() {
        double s = (sideA + sideB + sideC) * height;
        String result = String.format("%.2f",s);
        return result;
    }

    public String volumeByCorner() {
        double v = (0.5 * sideA * sideB * Math.sin(corner)) * height;
        String result = String.format("%.2f",v);
        return result;
    }
    public String areaSideByCorner() {
        double sideC = Math.sqrt(Math.pow(sideB, 2) + Math.pow(sideA, 2) - 2 * sideA * sideB * Math.cos(corner));
        double s = (sideA + sideB + sideC) * height;
        String result = String.format("%.2f",s);
        return result;
    }


}
