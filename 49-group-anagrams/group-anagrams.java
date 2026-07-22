class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            
            // Frequency array for 26 lowercase letters
            int[] freq = new int[26];

            for (char ch : str.toCharArray()) {
                freq[ch - 'a']++;
            }

            // Create a unique key from frequency
            StringBuilder key = new StringBuilder();

            for (int i = 0; i < 26; i++) {
                key.append('#');
                key.append(freq[i]);
            }

            // Add string to its anagram group
            map.putIfAbsent(key.toString(), new ArrayList<>());
            map.get(key.toString()).add(str);
        }

        return new ArrayList<>(map.values()); 
    }
}