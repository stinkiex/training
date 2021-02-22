package task1;

import java.math.BigInteger;

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

    public static BigInteger multiplyOfSquares(int a){
        BigInteger result = BigInteger.valueOf(1);
        for (int i= 1; i <= a; i++){
            result = BigInteger.valueOf(i).pow(2).multiply(result);
        }
        return result;
    }
}
