class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<Integer> q = new LinkedList<>();
        int time=0;
        for (int i = 0; i < tickets.length; i++) {
            q.offer(i);
        }

        while (!q.isEmpty()) {
            int a = q.poll();
            tickets[a] = tickets[a] - 1;
            time++;
            if (a == k && tickets[k] == 0) {
                return time;
            }
             if (tickets[a] > 0) {
                q.offer(a);
            }

        }

        return time;
    }
}