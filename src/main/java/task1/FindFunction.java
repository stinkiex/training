package task1;

public class FindFunction {


    public static double resultat(double a, double b, double c) {
        double result = ((a - 3) * b / 2) + c;
        return result;
    }

    public static double drobNumberOne(double a, double b, double c) {
        double result = (b + Math.sqrt((Math.pow(b, 2) + 4 * a * c)) / (2 * a)) - Math.pow(a, 3) * c + Math.pow(b, -2);
        return result;
    }

    public static double drobNumberTwo(double x, double y) {
        double result = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y);
        return result;
    }

    public static double changeDigits(double r) {
        String string = String.valueOf(r);
        // TODO: 19.02.2021 Дописать дома;

        double result = 123;
        return result;
    }
}