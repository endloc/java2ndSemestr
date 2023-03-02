package lesson3;

public class Dot {
    private double x;
    private double y;

    public Dot(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public String distanceTo(Dot secondDot) {
        double s = Math.sqrt(Math.pow(this.x - secondDot.x, 2) + Math.pow(this.y - secondDot.y, 2));
        String result = String.format("%.2f",s);
        return "distanse from dot (" + this.x + ", " + this.y + ") to dot (" + secondDot.x+ ", " + secondDot.y + "): " + result;
    }
    public String toString() {
        return "point coordinates: (" + x + ", " + y + ")\n";
    }
}
