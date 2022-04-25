import java.math.BigInteger;

public class Factorial {
    public static BigInteger factorial(int value) {
        if (BigInteger.valueOf(value) == BigInteger.ZERO) {
            return BigInteger.ONE;
        }

        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= value; ++i) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(factorial(1));
        System.out.println(factorial(3));
    }
}
