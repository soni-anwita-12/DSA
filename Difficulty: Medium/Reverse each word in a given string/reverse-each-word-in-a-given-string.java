class Solution {
    public String reverseWords(String s) {
        s = s.trim();  // remove leading and trailing spaces

        StringBuilder ans = new StringBuilder();

        String[] words = s.split("\\s+");  // handles multiple spaces

        for (int i = 0; i < words.length; i++) {

            StringBuilder temp = new StringBuilder(words[i]);

            ans.append(temp.reverse());

            if (i != words.length - 1) {
                ans.append(" ");
            }
        }

        return ans.toString();
        
    }
}
