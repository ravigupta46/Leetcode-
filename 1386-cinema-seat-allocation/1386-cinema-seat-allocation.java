class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {

        Map<Integer,List<Integer>> mp = new HashMap<>();

        for(int i = 0; i < reservedSeats.length; i++) {
            int key = reservedSeats[i][0];
            int value = reservedSeats[i][1];

            if(mp.containsKey(key)) {
                List<Integer> li = mp.get(key);
                li.add(value);
            }
            else {
                List<Integer> li = new ArrayList<>();
                li.add(value);
                mp.put(key, li);
            }
        }

        int count = (n - mp.size()) * 2;

        for(Map.Entry<Integer,List<Integer>> e : mp.entrySet()) {

            List<Integer> li = e.getValue();

            Collections.sort(li);

            boolean left = true;    // 2 3 4 5
            boolean middle = true;  // 4 5 6 7
            boolean right = true;   // 6 7 8 9

            for(int x : li) {

                if(x >= 2 && x <= 5) {
                    left = false;
                }

                if(x >= 4 && x <= 7) {
                    middle = false;
                }

                if(x >= 6 && x <= 9) {
                    right = false;
                }
            }

            if(left && right) {
                count += 2;
            }
            else if(left || middle || right) {
                count += 1;
            }
        }

        return count;
    }
}