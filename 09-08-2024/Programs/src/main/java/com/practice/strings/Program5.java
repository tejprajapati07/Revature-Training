package com.practice.strings;

public class Program5 {

    // Function to check if a given substring is a palindrome
    private static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Function to replace palindrome substrings with '*'
    public static String replacePalindromes(String input) {
        char[] result = input.toCharArray();
        int n = input.length();

        for (int i = 0; i < n; i++) {
            for (int j = i + 2; j <= n; j++) { // Consider substrings of length 2 or more
                String substring = input.substring(i, j);
                if (isPalindrome(substring)) {
                    // Replace characters in palindrome with '*'
                    for (int k = i; k < j; k++) {
                        result[k] = '*';
                    }
                }
            }
        }

        return new String(result);
    }

    // Main method to test the function
    public static void main(String[] args) {
        String input = "bob has a radar plane";
        String output = replacePalindromes(input);
        System.out.println(output); // Expected Output: *** has a ***** plane
    }
}