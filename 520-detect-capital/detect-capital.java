class Solution {
    public boolean detectCapitalUse(String word) {
        int Upperlet=0;
        for(int i=0;i<word.length();i++){
            if(Character.isUpperCase(word.charAt(i))) {
                Upperlet++;
            }

        }
        return Upperlet==word.length() || Upperlet==0 || (Upperlet==1 && Character.isUpperCase(word.charAt(0)));
        
    }
    
}