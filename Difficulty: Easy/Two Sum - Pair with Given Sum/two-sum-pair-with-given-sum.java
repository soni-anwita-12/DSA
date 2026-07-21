class Solution {
    boolean twoSum(int arr[], int target) {
        // code here
        Arrays.sort(arr);
        int n=arr.length;
        int i=0;
        int j=n-1;
        while(i<j){
            if(arr[i]+arr[j]==target) return true;
            else if(arr[i]+arr[j]>target) j--;
            else if(arr[i]+arr[j]<target) i++;
        }
        return false;
    }
}