package task1;

public class FindMaxFromMin {
    private int a, b, c, d;

    public FindMaxFromMin(int a, int b, int c, int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public int findMax() {
        int min1 = Math.min(this.a, this.b);
        int min2 = Math.min(this.c, this.d);
        return Math.max(min1, min2);
    }

}
