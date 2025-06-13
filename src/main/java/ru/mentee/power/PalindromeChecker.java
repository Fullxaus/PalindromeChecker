package ru.mentee.power;

public class PalindromeChecker {


    /**
     * Проверяет, является ли строка палиндромом.
     * Игнорируются пробелы и регистр.
     */
    public boolean isPalindrome(String input) {
        if (input == null) {
            return false;
        }
        String normalized = input.replaceAll("\\s+", "").toLowerCase();
        int left = 0;
        int right = normalized.length() - 1;

        while (left < right) {
            if (normalized.charAt(left) != normalized.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }


    public void isPalindrome(){


    }
}
