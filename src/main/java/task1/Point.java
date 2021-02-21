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

    public boolean isPoint(Point point){
        int x = point.getX();
        int y = point.getY();
        if ((x <= 2) && (x >= -2) && (y >= 0) && (y <= 4)){
            return true;
        } else if ((x <= 4) && (x >= -4) && (y <= 0) && (y >= -3)){
            return true;
        } else return false;
    }


}
