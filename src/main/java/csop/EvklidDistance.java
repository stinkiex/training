package csop;

import csop.model.Point;

public class EvklidDistance {

    public static void main(String[] args) {
        double x, y;

        if ((args[0] != null) && (args[1] != null)) {
            x = Double.parseDouble(args[0]);
            y = Double.parseDouble(args[1]);
        } else {
            x = Math.random() * 10 + 100;
            y = Math.random() * 10 + 100;
        }

        Point point = new Point(x, y);
        double z = distanceToZero(point);
        System.out.println("Евклидово растояние от (" + point.getX() + " ," + point.getY() + " ) до 0.0 равно " + z);
    }

    public static double distanceToZero(Point point) {
        double x1 = 0, y1 = 0;
        double result = Math.pow((Math.pow(point.getX(), 2) + Math.pow(point.getY(), 2)), 0.5);
        return result;
    }
}
