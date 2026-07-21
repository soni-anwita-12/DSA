class Solution {
    public static ArrayList<Integer> commonElements(int a[], int b[]) {
        // code here
        Arrays.sort(a);
        Arrays.sort(b);
        int i=0;
        int j=0;
        ArrayList<Integer>ans= new ArrayList<>();
        while(i<a.length && j<b.length){
            if(a[i]==b[j]){
                ans.add(a[i]);
                i++;
                j++;
            }
            else if(a[i]<b[j]){
                i++;
            }else{
                j++;
            }
            
            
        }
        return ans;
        
    }
}