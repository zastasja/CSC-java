public class Char {
    public static char charExpression(int a) {
        int s = (int) '\\';
        int sum = s + a;
        char res = (char) sum;
        return res;
    }
    public static void main(String[] args) {
        System.out.println(charExpression(15));
        System.out.println(charExpression(29));
    }
}
