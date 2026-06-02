class Solution {
    class Pair {
        int index;
        int freq;

        Pair(int index, int freq) {
            this.index = index;
            this.freq = freq;
        }
    }

    public int[] kWeakestRows(int[][] mat, int k) {
        List<Integer> li = new ArrayList<>();
        PriorityQueue<Pair> pq = new PriorityQueue<>(
                (a, b) -> {
                    if (a.freq == b.freq) {
                        return a.index - b.index; 
                    }
                    return a.freq - b.freq; 
                });
       Map<Integer, Integer> mp = new HashMap<>();

for (int i = 0; i < mat.length; i++) {

    int count = 0;

    for (int j = 0; j < mat[0].length; j++) {

        if (mat[i][j] == 1) {
            count++;
        }
    }

    mp.put(i, count);
}
        for (Map.Entry<Integer, Integer> e : mp.entrySet()) {
            Pair p = new Pair(e.getKey(), e.getValue());
            pq.add(p);
        }

        while (!pq.isEmpty()&&k > 0) {
            Pair p = pq.poll();
            int ele = p.index;
            li.add(ele);
            k--;
        }
        int z = 0;
        int[] ans = new int[li.size()];
        for (int a : li) {
            ans[z++] = a;
        }
        return ans;
    }
}