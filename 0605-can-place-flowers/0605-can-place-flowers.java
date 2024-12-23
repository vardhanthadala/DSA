class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        int i = 0;
        while (i < flowerbed.length) {
            // Check if the current position is empty and its neighboring positions are also
            // empty
            if (flowerbed[i] == 0 && (i == 0 || flowerbed[i - 1] == 0) &&
                    (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {
                flowerbed[i] = 1; 
                count++; 
            }
            if (count >= n) {
                return true; 
            }
            i++; 
        }
        return false; 
    }
}