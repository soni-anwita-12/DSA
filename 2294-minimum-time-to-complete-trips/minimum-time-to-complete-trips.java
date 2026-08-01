class Solution {
    public long minimumTime(int[] time, int totalTrips) {

        long minTime = Long.MAX_VALUE;

        for (int t : time) {
            minTime = Math.min(minTime, t);
        }

        long lo = 1;
        long hi = minTime * totalTrips;

        while (lo < hi) {

            long mid = lo + (hi - lo) / 2;

            long trips = 0;

            for (int t : time) {
                trips += mid / t;

                // Prevent unnecessary overflow
                if (trips >= totalTrips) {
                    break;
                }
            }

            if (trips >= totalTrips) {
                // mid time is enough
                // Try to find a smaller answer
                hi = mid;
            } else {
                // mid time is not enough
                lo = mid + 1;
            }
        }

        return lo;
    }
}