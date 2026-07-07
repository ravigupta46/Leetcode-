class Solution {
    public long sumAndMultiply(int n) {

        long num = 0;
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            if (rem > 0) {
                num = num * 10 + rem;
                sum += rem;
            }

            n = n / 10;
        }
        String s = String.valueOf(num);
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        long dig = Integer.parseInt(sb.toString());

        return dig * sum;
    }
}