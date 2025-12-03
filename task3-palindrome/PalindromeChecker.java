import java.util.Scanner;

public class PalindromeChecker {

    public static boolean isPalindrome(String input) {
        if (input == null) return false;
        String filtered = input.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        int i = 0, j = filtered.length() - 1;
        while (i < j) {
            if (filtered.charAt(i) != filtered.charAt(j)) return false;
            i++; j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to check:");
        String s = sc.nextLine();
        if (isPalindrome(s)) {
            System.out.println(\"\" + s + \"\" is a palindrome.");
        } else {
            System.out.println(\"\" + s + \"\" is NOT a palindrome.");
        }
        sc.close();
    }
}
