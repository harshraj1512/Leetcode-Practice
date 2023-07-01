class Solution {
    public int sumOfUnique(int[] nums) {
        int a = 0;

        for (int i = 0; i < nums.length; i++) {
            if(a < nums[i]){
                a = nums[i];
            }
        }
        int[] freq = new int[a+1];
        for (int i = 0; i < nums.length; i++) {
            freq[nums[i]]++;
        }
        int[] count = new int[freq.length];
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] == 1){
                count[i] = i;
            }
        }
        int sum = 0;
        for (int i = 0; i < count.length; i++) {
            sum += count[i];
        }
        return sum;
    }
}