package csop;

public class RandomFromAtoB {

    public static void main(String[] args) {
        int a, b, c, d;

        if ((args[0] != null) && (args[1] != null)) {
            a = Integer.parseInt(args[0]);
            b = Integer.parseInt(args[1]);
        } else {
            a = (int) (Math.random() * 10 + 100);
            b = (int) (Math.random() * 10 + 100);
        }
        d = sumFromOnetoSix();
        c = randomize(a, b);
        System.out.println(c + "\n" + d);
    }

    public static int randomize(int a, int b) {
        int r = (int) (a + Math.random() * b);
        return r;
    }

    public static int sumFromOnetoSix() {
        int a = (int) (1 + Math.random() * 6);
        int b = (int) (1 + Math.random() * 6);
        int r = a + b;
        return r;
    }

}
