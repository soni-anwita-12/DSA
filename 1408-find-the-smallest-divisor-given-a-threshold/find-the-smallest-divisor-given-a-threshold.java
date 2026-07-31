class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int low = 1;
        int high = 0;

        // Find maximum element
        for (int num : nums) {
            high = Math.max(high, num);
        }

        while (low < high) {
            int mid = low + (high - low) / 2;
            int sum = 0;

            // Calculate sum using divisor = mid
            for (int num : nums) {
                sum += (num + mid - 1) / mid;
            }

            if (sum <= threshold) {
                // mid is a possible answer
                // Try to find a smaller divisor
                high = mid;
            } else {
                // Divisor is too small
                low = mid + 1;
            }
        }

        return low;
    }
}