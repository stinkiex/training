package task1;

public class FunctionOnSection {
    double x, y;

    public FunctionOnSection(double x) {
        this.x = x;
        if (x > 2) {
            this.y = x;
        } else {
            this.y = -x;
        }
    }

    public static void functionOnsetion(double a, double b, double h) {
        int size = 0;
        for (double i = a; i <= b; i = i + h) {
            size++;
        }
        FunctionOnSection[] result = new FunctionOnSection[size];
        for (int i = 0; i < result.length; ) {
            for (double j = a; j <= b; j = j + h, i++) {
                FunctionOnSection functionOnSection = new FunctionOnSection(j);
                result[i] = functionOnSection;
            }
        }
        for (int i = 0; i < size; i++) {
            System.out.println(result[i].toString());
        }
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return "FunctionOnSection{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
