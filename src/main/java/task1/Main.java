package task1;

import static task1.FindFunction.*;

public class Main {

    public static void main(String[] args) {
        double a = resultat(Math.random() * 1000 + 1000, Math.random() * 1000 + 1000, Math.random() * 1000 + 1000);
        double b = drobNumberOne(Math.random() * 1000 + 1000, Math.random() * 1000 + 1000, Math.random() * 1000 + 1000);
        double c = drobNumberTwo(Math.random() * 1000 + 1000, Math.random() * 1000 + 1000);
        double d = changeDigits(123.456);
        Point point = new Point(2,2);
        boolean e = point.isPoint(point);
        System.out.println(e);

        Triangle triangle = new Triangle(89, 45);
        System.out.println("Существует ли треугольник " + triangle.isExists(triangle));
        System.out.println("Он прямоугольный: " + triangle.isQuadratic());

        System.out.println("a = " + a + "\nb = " + b + "\nc = " + c);
        TimeRemain timeRemain = new TimeRemain(7261);
        System.out.println(timeRemain.toString());
    }
}
