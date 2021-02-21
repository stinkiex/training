package task1;

public class Numbers {
    public static int sumOfNumbers(int a){
        int sum = 0;
        for (int i = 0; i <= a; i++){
            sum = sum + i;
        }
        return sum;
    }

    public static int sumOfSquares(int a){
        int sum = 0;
        for (int i = 0; i <= a; i++){
            sum = sum + i*i;
        }
        return sum;
    }
}
