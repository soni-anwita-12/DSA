class Solution {
    public int missingNumber(int[] arr) {
        int n=arr.length;
        int sum_actual=0;
        int sum=n*(n+1)/2;
        for(int i=0;i<n;i++){
            sum_actual+=arr[i];

        }
        return (sum)-(sum_actual);
    }
}