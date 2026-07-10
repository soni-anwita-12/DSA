class Solution {
    public int findNumbers(int[] arr) {
        int count=0;
        
        for(int num:arr){
            int len=String.valueOf(num).length();
            if(len% 2==0){
                count++;
            }
        }
        return count;
        
    }
}