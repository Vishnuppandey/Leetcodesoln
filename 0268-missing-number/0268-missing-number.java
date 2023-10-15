class Solution {
    public int missingNumber(int[] nums) {
        HashSet<Integer> st=new HashSet<>();
        for(int i:nums){
            st.add(i);
        }
        for(int i=0;i<nums.length;i++){
            if(st.contains(i)) continue;
            else return i;
        }
        return nums.length;
    }
}