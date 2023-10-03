class Solution {
    public boolean isPalindrome(int x) {
        if(x==-1){
            return false;
        }
       return  x==rev(x);
    }
    public int rev(int x){
       int digits=(int)(Math.log10(x))+1;
      return helper(x,digits); 
    }
    public int helper(int x,int digits){
        if(x%10==x){
            return x;
        }
        int rem=x%10;
        return rem*(int)(Math.pow(10,digits-1))+helper(x/10,digits-1);
    }
}