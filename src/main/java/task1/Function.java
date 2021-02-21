package task1;

public class Function {
    double x, y;

    public Function(double x) {
        this.x = x;
        if (x <= 3){
            this.y = Math.pow(x, 2) - x + 9;
        } else {
            this.y = 1 / (Math.pow(x, 3) + 6);
        }
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }
}
