class Solution {

    class Pair {
        int ele;
        int freq;

        Pair(int ele, int freq) {
            this.ele = ele;
            this.freq = freq;
        }
    }

    public int findLeastNumOfUniqueInts(int[] arr, int k) {

        Map<Integer, Integer> mp = new HashMap<>();

        for (int a : arr) {
            mp.put(a, mp.getOrDefault(a, 0) + 1);
        }

        PriorityQueue<Pair> pq = new PriorityQueue<>(
            (a, b) -> a.freq - b.freq
        );

        for (Map.Entry<Integer, Integer> e : mp.entrySet()) {
            pq.add(new Pair(e.getKey(), e.getValue()));
        }

        while (!pq.isEmpty()) {

            Pair first = pq.poll();

            if (k >= first.freq) {
                k -= first.freq;
            }
            else {
                return pq.size() + 1;
            }
        }

        return 0;
    }
}