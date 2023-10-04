class Solution {
    public int minCut(String s) {
        int n = s.length();
        boolean[][] isPalindrome = new boolean[n][n];
        int[] minCuts = new int[n];
        
        for (int i = 0; i < n; i++) {
            minCuts[i] = i; // Maximum cuts for a string of length i is i.
            for (int j = 0; j <= i; j++) {
                if (s.charAt(i) == s.charAt(j) && (i - j <= 1 || isPalindrome[j + 1][i - 1])) {
                    isPalindrome[j][i] = true;
                    if (j == 0) {
                        minCuts[i] = 0; // s[0...i] is a palindrome, no cut needed.
                    } else {
                        minCuts[i] = Math.min(minCuts[i], minCuts[j - 1] + 1);
                    }
                }
            }
        }
        
        return minCuts[n - 1];
    }
}
