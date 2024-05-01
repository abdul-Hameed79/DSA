// Write a java program to print whether a string is palindrome or not

package Strings;

public class Palindrome {
    // Function to check string is palindrome or not
    public static boolean isPalindrome(String str) {
        for(int i=0; i<str.length()/2; i++) {
            int n = str.length();
            if(str.charAt(i) != str.charAt(n-i-1)) {
                return false;
            }
        }
        return true;
    }
    // Main.java
    public static void main(String[] args) {
        String str = "madam";

        // Function call
        System.out.println(isPalindrome(str));
    }
}