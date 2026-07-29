class Solution {
    public int[] searchRange(int[] arr, int target) {
        ArrayList<Integer>ans=new ArrayList<>();
        //first occurance
        int n=arr.length;
        int lo=0;
        int hi=n-1;
        int first=-1;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(arr[mid]<target){
                lo=mid+1;
            } else if(arr[mid]>target){
                hi=mid-1;
            }else{
                first=mid;
                hi=mid-1;

            }
        }
        ans.add(first);
        //last occurance
        lo=0;
        hi=n-1;
        int last=-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(arr[mid]<target){
                lo=mid+1;
            } else if(arr[mid]>target){
                hi=mid-1;
            }else{
                last=mid;
                lo=mid+1;

            }
        }
        ans.add(last);
        return new int[]{first, last};
        
    
    }
}