public class PalindromeChecker {

    String isPalindrome(String str) {
        int n = str.length();
       if (n > 0) {
            for (int i = 0; i < n / 2; i++)
                if (str.charAt(i) != str.charAt(n - i - 1)) return false +"\nText length is: " + n ;
        return true + "\nText length is: " + n;
    }
       return "There is no text to check";
    }
}


