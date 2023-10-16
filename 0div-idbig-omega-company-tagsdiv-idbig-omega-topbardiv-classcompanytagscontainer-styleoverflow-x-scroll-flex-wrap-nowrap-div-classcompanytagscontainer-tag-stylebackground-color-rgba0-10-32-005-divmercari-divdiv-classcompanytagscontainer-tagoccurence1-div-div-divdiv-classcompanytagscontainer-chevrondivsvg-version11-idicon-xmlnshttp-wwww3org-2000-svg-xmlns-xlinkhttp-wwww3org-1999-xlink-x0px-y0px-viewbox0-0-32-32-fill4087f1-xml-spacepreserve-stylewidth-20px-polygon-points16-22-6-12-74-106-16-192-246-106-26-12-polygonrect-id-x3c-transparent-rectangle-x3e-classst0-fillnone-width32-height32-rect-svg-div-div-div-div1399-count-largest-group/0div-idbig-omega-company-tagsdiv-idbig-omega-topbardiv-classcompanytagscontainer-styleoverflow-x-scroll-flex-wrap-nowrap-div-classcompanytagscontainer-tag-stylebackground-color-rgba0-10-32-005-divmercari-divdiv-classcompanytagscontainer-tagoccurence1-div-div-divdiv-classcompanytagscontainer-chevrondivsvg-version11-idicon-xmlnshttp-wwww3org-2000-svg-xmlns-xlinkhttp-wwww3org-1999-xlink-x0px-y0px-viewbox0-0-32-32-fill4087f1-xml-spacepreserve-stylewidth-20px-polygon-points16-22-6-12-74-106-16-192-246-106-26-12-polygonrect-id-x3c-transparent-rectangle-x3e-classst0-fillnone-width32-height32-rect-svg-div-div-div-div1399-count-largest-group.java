class Solution {
    public int countLargestGroup(int n) {

   int[] res = new int[50];
        for (int i = 1; i <= n; i++) {
            int a = 0, k = i;
            while (k != 0) {
                a += k % 10;
                k /= 10;
            }
            res[a]++;
        }
        int max = 0, count = 0;
        for (int x : res) if (max < x) max = x;
        for (int x : res) if (max == x) count++;
        return count;

    }
}