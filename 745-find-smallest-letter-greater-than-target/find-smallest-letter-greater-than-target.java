class Solution {
    public char nextGreatestLetter(char[] arr, char tar) {
        int lo=0 , hi=arr.length-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(arr[mid]>tar) hi=mid-1;
            else lo=mid+1;

        }
        return arr[lo % arr.length];
    }
}