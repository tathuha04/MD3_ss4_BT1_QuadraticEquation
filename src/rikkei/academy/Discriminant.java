package rikkei.academy;

public class Discriminant {
    double a, b, c;
    public Discriminant() {
    }

    public Discriminant(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

//    public double getC() {
//        return c;
//    }

    public double getDiscriminant() {
        return b * b - 4 * a * c;
    }
}
