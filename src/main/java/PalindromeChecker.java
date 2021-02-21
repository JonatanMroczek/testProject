public class PalindromeChecker {
    private final String textToCheck;


    public PalindromeChecker(String textToCheck) {
        this.textToCheck = textToCheck;
    }

    boolean isPalindrome() {
        int n = textToCheck.length();
        for (int i = 0; i < n / 2; i++)
            if (textToCheck.charAt(i) != textToCheck.charAt(n - i - 1)) return false;
        return true;
    }

    public String getTextLengthAndCheckForPalindrome() {
        int n = textToCheck.length();
        if (n > 0) {
            return "Text length is " + n + "\nText is a palindrome: " + this.isPalindrome();

        } else
            return "There is no text to check";
    }


}


