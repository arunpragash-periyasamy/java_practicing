// https://leetcode.com/problems/median-of-two-sorted-arrays/submissions/1225945859/?source=submission-ac
class Solution{
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int start1 = 0;
        int end1 = nums1.length;
        int start2 = 0; 
        int index = 0;
        int end2 = nums2.length;
        int[] arr = new int[end1+end2];
        while(start1 < end1 && start2 < end2){
            if(nums1[start1]<nums2[start2]){
                arr[index++] = nums1[start1++];
            }else{
                arr[index++] = nums2[start2++];
            }
        }
        while(start1<end1){
            arr[index++] = nums1[start1++];
        }
        while(start2<end2){
            arr[index++] = nums2[start2++];
        }
        if(arr.length%2 == 1){
            return arr[arr.length/2];
        }
        return (arr[arr.length/2]+arr[arr.length/2-1])/2.0;
    }
}
public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr = {1,3};
        int[] arr2 = {2};
        Solution solution = new Solution();
        double data = solution.findMedianSortedArrays(arr,arr2);
        System.out.println(data);
    }
}
