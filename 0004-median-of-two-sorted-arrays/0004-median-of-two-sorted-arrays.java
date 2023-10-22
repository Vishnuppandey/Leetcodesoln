class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int k=m+n;
        int nums3[]=new int[k];
        for(int i=0;i<n;i++){
            nums3[i]=nums1[i];
        }
        for(int i=0;i<m;i++){
            nums3[i+n]=nums2[i];
        }
        Arrays.sort(nums3);
        if(k%2!=0){
       return (double)(nums3[k/2]);
        }
        return (double)(nums3[k/2-1]+nums3[k/2])/2;
    }
}