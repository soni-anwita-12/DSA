class Solution {
    public boolean search(int[] arr, int tar) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Target found
            if (arr[mid] == tar) {
                return true;
            }

            // Duplicates: cannot determine which half is sorted
            if (arr[left] == arr[mid] && arr[mid] == arr[right]) {
                left++;
                right--;
            }

            // Left half is sorted
            else if (arr[left] <= arr[mid]) {

                // Target lies in the sorted left half
                if (arr[left] <= tar && tar < arr[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }

            // Right half is sorted
            else {

                // Target lies in the sorted right half
                if (arr[mid] < tar && tar <= arr[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }

        return false;
    }
}