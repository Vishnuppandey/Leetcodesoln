class Solution {
    public String shortestCommonSupersequence(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();
        int t[][] = new int[n+1][m+1];

        // Populate the DP table
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= m; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    t[i][j] = 1 + t[i - 1][j - 1];
                } else {
                    t[i][j] = Math.max(t[i - 1][j], t[i][j - 1]);
                }
            }
        }

        // Build the shortest common supersequence using DP table
        int i = n;
        int j = m;
        StringBuilder sb = new StringBuilder();
        while (i > 0 && j > 0) {
            if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                sb.append(str1.charAt(i - 1));
                i--;
                j--;
            } else {
                if (t[i - 1][j] > t[i][j - 1]) {
                    sb.append(str1.charAt(i - 1));
                    i--;
                } else {
                    sb.append(str2.charAt(j - 1));
                    j--;
                }
            }
        }

        // Append remaining characters from str1 and str2
        while (i > 0) {
            sb.append(str1.charAt(i - 1));
            i--;
        }
        while (j > 0) {
            sb.append(str2.charAt(j - 1));
            j--;
        }

        // Reverse the StringBuilder and convert to String
        return sb.reverse().toString();
    }
}
