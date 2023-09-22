class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
         Stack<Integer> st=new Stack<>();
         HashMap<Integer,Integer> mp=new HashMap<>();
         for(int n:nums2){
             while(!st.isEmpty()&&st.peek()<n){
                 mp.put(st.pop(),n);
             }
             st.push(n);
         }
         int ans[]=new int[nums1.length];
         for(int i=0;i<nums1.length;i++){
             ans[i]=mp.getOrDefault(nums1[i],-1);
         }
         return ans;
    }
}