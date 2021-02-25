package mathematic.model;

public class QuadraticEquation {
    double a, b, c, d, discriminant, x1, x2;

    /*
    Уравнение вида a*x^2 + b*x + c = d;
     */

    public QuadraticEquation(double a, double b, double c, double d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.discriminant = Math.pow(b, 2) - (4 * a * (c - d));
        if (discriminant >= 0) {
            x1 = ((-1 * b) + Math.sqrt(discriminant)) / (2 * a);
            x2 = ((-1 * b) - Math.sqrt(discriminant)) / (2 * a);
        }
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

    public double getDiscriminant() {
        return discriminant;
    }

    public void setDiscriminant(double discriminant) {
        this.discriminant = discriminant;
    }

    public double getX1() {
        return x1;
    }

    public double getX2() {
        return x2;
    }

    @Override
    public String toString() {
        return "QuadraticEquation{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", d=" + d +
                ", x1=" + x1 +
                ", x2=" + x2 +
                '}';
    }
}
