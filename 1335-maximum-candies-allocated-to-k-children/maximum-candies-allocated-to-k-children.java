class Solution {
    public int maximumCandies(int[] candies, long k) {

        int max = 0;

        for (int c : candies) {
            max = Math.max(max, c);
        }

        int lo = 1;
        int hi = max;
        int ans = 0;

        while (lo <= hi) {

            int mid = lo + (hi - lo) / 2;

            long children = 0;

            for (int c : candies) {
                children += c / mid;
            }

            if (children >= k) {
                // mid candies per child is possible
                ans = mid;

                // Try to give each child more candies
                lo = mid + 1;

            } else {
                // mid is too large
                hi = mid - 1;
            }
        }

        return ans;
    }
}