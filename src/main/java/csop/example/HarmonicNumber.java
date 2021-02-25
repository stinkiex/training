package csop.example;

public class HarmonicNumber {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        double sum = 0.0;
        for (int i = 0; i <= n; i++) {
            sum += 1.0 / i;
        }
        System.out.println(sum);
    }
}
