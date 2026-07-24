class Solution {
    public int mySqrt(int n) {
        if (n < 2) {
            return n;
        }

        long lo = 1, hi = n;
        long ans = 0;

        while (lo <= hi) {
            long mid = lo + (hi - lo) / 2;

            if (mid * mid == n) {
                return (int) mid;
            } else if (mid * mid < n) {
                ans = mid;       // possible answer
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }

        return (int) ans;
    }
}