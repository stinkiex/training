package task1;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public static boolean isPoint(Point point) {
        int x = point.getX();
        int y = point.getY();
        if ((x <= 2) && (x >= -2) && (y >= 0) && (y <= 4)) {
            return true;
        } else return (x <= 4) && (x >= -4) && (y <= 0) && (y >= -3);
    }

    public static boolean onOneLine(Point point1, Point point2, Point point3){
        int x1 = point1.getX();
        int x2 = point2.getX();
        int x3 = point3.getX();
        int y1 = point1.getY();
        int y2 = point2.getY();
        int y3 = point3.getY();
        if ((x3 - x1) / (x2 - x1) == (y3 - y1) / (y2 - y1)){
            return true;
        } else return false;
    }
}
