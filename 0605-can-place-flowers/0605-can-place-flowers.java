class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int isolatedzeroes = 0;
        int len = flowerbed.length;
        for (int i = 0; i < len; i++) {
            if (flowerbed[i] == 0) {
                if (i == 0) {
                    if (i + 1 == len || flowerbed[i + 1] == 0) {
                        isolatedzeroes++;
                        flowerbed[i] = 1;
                    }
                } else if (i < len - 1) {
                    if (flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0) {
                        isolatedzeroes++;
                        flowerbed[i] = 1;
                    }
                } else {
                    if (i - 1 < 0 || flowerbed[i - 1] == 0) {
                        isolatedzeroes++;
                        flowerbed[i] = 1;
                    }
                }
            }
        }
        return isolatedzeroes >= n;
    }
}