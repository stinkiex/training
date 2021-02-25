package mathematic.model;

public class Vector {
    private double x1, x2, y1, y2;

    public Vector(double x1, double x2, double y1, double y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    public Vector(double x2, double y2) {
        this.x2 = x2;
        this.y2 = y2;
        this.x1 = 0;
        this.y1 = 0;
    }

    public double vectorLength(Vector vector) {
        double result = Math.sqrt(Math.pow((vector.getX2() - vector.getX1()), 2) + Math.pow((vector.getY2() - vector.getY1()), 2));
        return result;
    }

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getY1() {
        return y1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public double getY2() {
        return y2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }

    @Override
    public String toString() {
        return "Vector{" +
                "x1=" + x1 +
                ", x2=" + x2 +
                ", y1=" + y1 +
                ", y2=" + y2 +
                '}';
    }
}
