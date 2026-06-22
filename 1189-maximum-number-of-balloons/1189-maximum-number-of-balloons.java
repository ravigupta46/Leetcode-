class Solution {
    public int maxNumberOfBalloons(String text) {
        Map<Character, Integer> mp = new HashMap<>();
        mp.put('b', 0);
        mp.put('a', 0);
        mp.put('l', 0);
        mp.put('o', 0);
        mp.put('n', 0);

        for (char ch : text.toCharArray()) {
            if (mp.containsKey(ch)) {
                mp.put(ch, mp.get(ch) + 1);
            }
        }

        mp.put('l', mp.get('l') / 2);
        mp.put('o', mp.get('o') / 2);

        int ans = Integer.MAX_VALUE;

        for (int count : mp.values()) {
            ans = Math.min(ans, count);
        }

        return ans;
    }
}