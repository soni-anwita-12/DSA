class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 0;

        // Find the maximum pile
        for (int pile : piles) {
            high = Math.max(high, pile);
        }

        while (low < high) {
            int mid = low + (high - low) / 2;

            long hours = 0;

            // Calculate total hours needed at speed = mid
            for (int pile : piles) {
                hours += (pile + mid - 1) / mid; // Ceiling division
            }

            if (hours <= h) {
                high = mid;      // Try a smaller speed
            } else {
                low = mid + 1;   // Increase the speed
            }
        }

        return low;
    }
}