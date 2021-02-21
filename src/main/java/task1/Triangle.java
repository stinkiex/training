package task1;

public class Triangle {
    private double a, b;

    public Triangle(double a, double b) {
        this.a = a;
        this.b = b;
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

    public boolean isExists(Triangle triangle) {
        double a = this.a;
        double b = this.b;
        return !(a + b >= 180);
    }

    public boolean isQuadratic() {
        return (this.a + this.b == 90) || (this.a == 90) || (this.b == 90);

    }
}
