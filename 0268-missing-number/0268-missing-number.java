class Solution {
    public int missingNumber(int[] nums) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            mp.put(nums[i],nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            if(mp.containsKey(i)){
                continue;
            }
            else{
               return i;
            }
        }
        return nums.length;
    }
}