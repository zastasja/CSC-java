public class Palidrome {
    public static boolean isPalindrome(String text) {
        String replaced = text.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        String reversed = new StringBuffer(replaced).reverse().toString();
        return reversed.equals(replaced);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("Able was I ere I saw Elba"));
        System.out.println(isPalindrome("Madam. M-A-D-A-M."));
    }
}
