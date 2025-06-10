package leet;

public class leet88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;         // pointer for nums1's valid elements
        int j = n - 1;         // pointer for nums2
        int k = m + n - 1;     // pointer for placement in nums1

        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }

        // if any remaining elements in nums2
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }

}
    

