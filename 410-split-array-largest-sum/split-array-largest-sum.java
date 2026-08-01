class Solution {

    public int splitArray(int[] nums, int k) {

        int lo = 0;
        int hi = 0;

        // Find maximum element and total sum
        for (int num : nums) {
            lo = Math.max(lo, num);
            hi += num;
        }

        while (lo <= hi) {

            int mid = lo + (hi - lo) / 2;

            int subarrays = 1;
            int currentSum = 0;

            for (int num : nums) {

                if (currentSum + num <= mid) {
                    currentSum += num;
                } else {
                    // Start a new subarray
                    subarrays++;
                    currentSum = num;
                }
            }

            if (subarrays <= k) {
                // mid is possible
                // Try to minimize it
                hi = mid - 1;
            } else {
                // mid is too small
                // Need a larger maximum sum
                lo = mid + 1;
            }
        }

        return lo;
    }
}