package backlog.leetcodeMustDo150.mergeSortedarray;

public class Solution1 {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        //to be accomodated in single array num1.

        // Initialize the pointers for nums1 and nums2, and the end pointer.
        int p1 = m - 1;
        int p2 = n - 1;
        int end = m + n - 1;

        // Backwards merge nums2 into nums1.
        while (p2 >= 0) {
            if (p1 >= 0 && nums1[p1] > nums2[p2]) {
                nums1[end] = nums1[p1];
                p1--;
            } else {
                nums1[end] = nums2[p2];
                p2--;
            }
            end--;
        }
        // If there are still elements in nums2 that are not put into nums1, put them now.
        // (This step may not be necessary because if there are remaining elements in nums2,
        // they are already the smallest ones and should be at the start of nums1.)
        while (p2 >= 0) {
            nums1[end] = nums2[p2];
            p2--;
            end--;
        }

    }
}
