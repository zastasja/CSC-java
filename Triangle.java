import java.io.IOException;

public class Triangle {
    public static boolean isTriangle(int a, int b, int c) throws IOException {
//        System.out.println("Enter first side");
//        int a = System.in.read();
//        System.out.println("Enter second side");
//        int b = System.in.read();
//        System.out.println("Enter third side");
//        int c = System.in.read();

        return (a + b >= c) && (a + c >= b) && (b + c >= a) && (a > 0) && (b > 0) && (c > 0);
    }

}
