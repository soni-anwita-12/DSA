class Solution {
    public char nonRepeatingChar(String s) {
        // code here
        int []freq=new int [26];
        int n=s.length();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            int idx=ch-'a';
            freq[idx]++;
        }
        char ans='$';
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(freq[ch-'a']==1){
                ans=ch;
                break;
            }

        }
        return ans;
        
    }
}
