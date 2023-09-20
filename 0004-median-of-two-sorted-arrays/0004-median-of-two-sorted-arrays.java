class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int k=n+m;
    int arr3[]=new int[k];
    for(int i=0;i<n;i++){
        arr3[i]=nums1[i];
    }
    for(int i=0;i<m;i++){
        arr3[n+i]=nums2[i];
    }
    Arrays.sort(arr3);
    if(k%2!=0){
        return (double) arr3[k/2];
    }
    return (double)(arr3[(k-1)/2]+arr3[k/2])/2.0;
    }
}