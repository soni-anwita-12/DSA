class Solution {

    private void subsets(String ans, String s, int idx, ArrayList<String> list) {
        if (idx == s.length()) {
            if (ans.length() != 0) {
                list.add(ans);
            }
            return;
        }

        char ch = s.charAt(idx);

        // Include current character
        subsets(ans + ch, s, idx + 1, list);

        // Exclude current character
        subsets(ans, s, idx + 1, list);
    }

    public ArrayList<String> powerSet(String s) {
        ArrayList<String> list = new ArrayList<>();

        subsets("", s, 0, list);

        Collections.sort(list);

        return list;
    }
}