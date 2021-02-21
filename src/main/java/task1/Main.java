package task1;

import static task1.FindFunction.*;

public class Main {

    public static void main(String[] args) {
        double a = resultat(Math.random() * 1000 + 1000, Math.random() * 1000 + 1000, Math.random() * 1000 + 1000);
        double b = drobNumberOne(Math.random() * 1000 + 1000, Math.random() * 1000 + 1000, Math.random() * 1000 + 1000);
        double c = drobNumberTwo(Math.random() * 1000 + 1000, Math.random() * 1000 + 1000);
        double d = 123.456;
        System.out.println(d + "  " + changeDigits(d));
        Point point = new Point(2,2);
        boolean e = Point.isPoint(point);
        System.out.println(e);

        Triangle triangle = new Triangle(89, 45);
        System.out.println("Существует ли треугольник " + triangle.isExists(triangle));
        System.out.println("Он прямоугольный: " + triangle.isQuadratic());

        System.out.println("a = " + a + "\nb = " + b + "\nc = " + c);
        TimeRemain timeRemain = new TimeRemain(7261);
        System.out.println(timeRemain.toString());

        FindMaxFromMin findMaxFromMin = new FindMaxFromMin(1,2,3,4);
        System.out.println(findMaxFromMin.findMax());

        Point point1 = point;
        Point point2 = new Point(1,1);
        Point point3 = new Point(4,4);
        boolean f = Point.onOneLine(point1, point2, point3);
        System.out.println(f);

        Hole hole = new Hole(2,3);
        Brick brick = new Brick(1,2,3);
        boolean g = brick.isBrickInHole(hole);
        System.out.println(g);

        Function function = new Function(3);
        System.out.println(function.getY());
        Function function2 = new Function(4);
        System.out.println(function2.getY());

        int h = (int)(Math.random()*100+100);
        System.out.println("Сумма чисел от 1 до "+ h + " равна " + Numbers.sumOfNumbers(h));
        System.out.println("Сумма квадратов первых 100 чисел равна " + Numbers.sumOfSquares(100));

    }
}
