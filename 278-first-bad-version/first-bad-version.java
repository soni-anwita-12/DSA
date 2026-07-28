/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int lo = 1;
        int hi = n;

        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;

            if (isBadVersion(mid)) {
                // mid is bad, so first bad version is
                // mid or somewhere before mid
                hi = mid;
            } else {
                // mid is good, so first bad version
                // must be after mid
                lo = mid + 1;
            }
        }

        return lo;
    }
}