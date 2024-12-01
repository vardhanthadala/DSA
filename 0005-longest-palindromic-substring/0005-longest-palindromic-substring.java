class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) {
            return "";
        }
        
        int start = 0, end = 0; // Track the start and end indices of the longest palindrome
        
        for (int i = 0; i < s.length(); i++) {
            // Check for odd-length palindrome centered at i
            int len1 = expandAroundCenter(s, i, i);
            // Check for even-length palindrome centered between i and i + 1
            int len2 = expandAroundCenter(s, i, i + 1);
            
            // Take the longer of the two
            int len = Math.max(len1, len2);
            
            // Update the start and end indices if the current palindrome is longer
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        
        // Extract and return the longest palindromic substring
        return s.substring(start, end + 1);
    }
    
    // Expand around the center and return the length of the palindrome
    private int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        // Return the length of the palindrome
        return right - left - 1;
    }
}
