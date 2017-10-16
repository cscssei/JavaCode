public class MergeArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1, j = n-1, k = m+n-1;
        // rewrite nums1 from the tail, store the bigger value
        while(i>-1 && j>-1){
            nums1[k--] = (nums1[i]>nums2[j])?nums1[i--]:nums2[j--];
        }
        // if nums2 is longer, put the remaining numbers in the list
        // if nums1 is longer, the un-rewrite numbers are already sorted in descent order
        while(j>-1){
            nums1[k--] = nums2[j--];
        }
        return;
    }
}
