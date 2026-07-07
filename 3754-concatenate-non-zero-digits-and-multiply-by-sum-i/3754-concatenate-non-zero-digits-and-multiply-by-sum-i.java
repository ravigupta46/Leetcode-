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
        long dig=0;

        while(num>0){
            long rem=num%10;
            dig=dig*10+rem;
            num=num/10;
        }
        return dig * sum;
    }
}