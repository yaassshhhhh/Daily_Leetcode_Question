class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = 0;
        int j = 0;
        int id = 0;

        int[] res = new int[m + n];

        // compare and merge
        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) {
                res[id] = nums1[i];
                i++;
            } else {
                res[id] = nums2[j];
                j++;
            }
            id++;
        }

        // remaining elements of nums1
        while (i < m) {
            res[id] = nums1[i];
            i++;
            id++;
        }

        // remaining elements of nums2
        while (j < n) {
            res[id] = nums2[j];
            j++;
            id++;
        }

        // copy result back to nums1
        for (int k = 0; k < m + n; k++) {
            nums1[k] = res[k];
        }
    }
}
