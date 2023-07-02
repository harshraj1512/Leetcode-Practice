class Solution {
    public int findGCD(int[] nums) {
        int min = nums[0];
        int max = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min){
                min = nums[i];
            } else if(nums[i] > max){
                max = nums[i];
            }
        }
        int[] minarr = new int[max+1];
        int[] maxarr = new int[max+1];
        for (int i = 1; i <= min; i++) {
            if (min%i == 0){
                minarr[i] = i;
            }
        }

        for (int i = 1; i <= max; i++) {
            if (max%i == 0){
                maxarr[i] = i;
            }
        }
        int a = 0;
        for (int i = 0; i < maxarr.length; i++) {
            if (minarr[i] == maxarr[i]){
                if (minarr[i] > 0){
                     a = minarr[i];
                }
            }
        }
        return a;
    }
}