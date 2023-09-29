class Solution {
    static int[][] t;
    public int longestCommonSubsequence(String text1, String text2) {
        int n=text1.length();
        int m=text2.length();
        t=new int[n+1][m+1];
        for(int i=0;i<=n;i++){
            Arrays.fill(t[i],-1);
        }
        return helper(text1,text2,n,m);
    }
    public int helper(String text1,String text2,int n,int m){
        if(n==0||m==0){
            return 0;
        }
         if(t[n][m]!=-1){
             return t[n][m];
         }
        if(text1.charAt(n-1)==text2.charAt(m-1)){
            return t[n][m]=1+helper(text1,text2,n-1,m-1);
        }
        else {
            return t[n][m]=Math.max(helper(text1,text2,n-1,m),helper(text1,text2,n,m-1));
        }
    }
}