class Solution {

    class Node {
        Node[] children = new Node[26];
        boolean eow = false;
    }

    Node root = new Node();

    public void insert(String s) {

        Node curr = root;

        for (int i = 0; i < s.length(); i++) {

            int idx = s.charAt(i) - 'a';

            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }

            curr = curr.children[idx];
        }

        curr.eow = true;
    }

    public boolean solve(String s, int idx, Boolean[] dp) {

        if (idx == s.length()) {
            return true;
        }

        if (dp[idx] != null) {
            return dp[idx];
        }

        Node curr = root;

        for (int i = idx; i < s.length(); i++) {

            int child = s.charAt(i) - 'a';

            if (curr.children[child] == null) {
                return dp[idx] = false;
            }

            curr = curr.children[child];

            if (curr.eow && solve(s, i + 1, dp)) {
                return dp[idx] = true;
            }
        }

        return dp[idx] = false;
    }

    public boolean wordBreak(String s, List<String> wordDict) {

        for (String str : wordDict) {
            insert(str);
        }

        Boolean[] dp = new Boolean[s.length()];

        return solve(s, 0, dp);
    }
}