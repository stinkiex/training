package task1;

public class Brick {
    int x, y, z;

    public Brick(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    public boolean isBrickInHole(Hole hole) {
        int s = hole.getA() * hole.getB();
        return (this.x * this.y <= s) || (this.x * this.z <= s) || (this.z * this.y <= s);
    }
}
