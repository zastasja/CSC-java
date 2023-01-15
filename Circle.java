import java.io.IOException;
import java.util.Scanner;

public class Circle {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius: ");
        double r = sc.nextDouble();

        double area = Math.PI*Math.pow(r, 2);

        System.out.println("For the circle with radius: " + r + ";");
        System.out.println("the area is: "+ area + ".");
    }
}
