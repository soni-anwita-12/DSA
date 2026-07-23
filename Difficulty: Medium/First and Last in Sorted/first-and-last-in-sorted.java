class Solution {
    ArrayList<Integer> find(int arr[], int target) {
        // code here
        ArrayList<Integer>ans=new ArrayList<>();
        //first occurance
        int n=arr.length-1;
        int lo=0;
        int hi=n;
        int idx=-1;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(arr[mid]<target){
                lo=mid+1;
            } else if(arr[mid]>target){
                hi=mid-1;
            }else{
                idx=mid;
                hi=mid-1;

            }
        }
        ans.add(idx);
        //last occurance
        lo=0;
        hi=n;
        idx=-1;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(arr[mid]<target){
                lo=mid+1;
            } else if(arr[mid]>target){
                hi=mid-1;
            }else{
                idx=mid;
                lo=mid+1;

            }
        }
        ans.add(idx);
        return ans;
    }
}
