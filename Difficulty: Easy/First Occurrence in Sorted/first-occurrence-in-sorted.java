class Solution {
    public int firstSearch(int[] arr, int tar) {
        // Code Here
        int n=arr.length;
        int lo=0;
        int hi=n-1;
        int idx=-1;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(arr[mid]>tar) hi=mid-1;
            else if(arr[mid]<tar) lo=mid+1;
            else{
                idx=mid;
                hi=mid-1;
            }
        }
        return idx;
    }
}