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

    public boolean isExists(Triangle triangle){
        double a = this.a;
        double b = this.b;
        if (a+b >= 180){
            return false;
        } else {
            return true;
        }
    }

    public boolean isQuadratic(){
        if ((this.a + this.b == 90) || (this.a == 90) || (this.b == 90))
            return true;
        else return false;

    }
}
