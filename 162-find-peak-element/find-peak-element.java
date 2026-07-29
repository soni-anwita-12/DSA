class Solution {
    public int findPeakElement(int[] arr) {
        int lo=1;
        int n=arr.length;
        int hi=n-1;
        if (n == 1 || arr[0] > arr[1]) {
            return 0;
        }

        // Check last element
        if (arr[n - 1] > arr[n - 2]) {
            return n - 1;
        }
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
                return mid;
            }
            else if(arr[mid]>arr[mid-1] && arr[mid]<arr[mid+1]){
                lo=mid+1;
            }
            else{
                hi=mid-1;
            }
            
        }
        return -1;
        
    }
}