class Solution {
    public int differenceOfSum(int[] nums) {
        int sum = 0;
        int sum2 =0;
        for(int i =0; i<nums.length; i++){
            sum += nums[i];
            while(nums[i]>0){
                int digit = nums[i] % 10;
                sum2 += digit;
                nums[i] = nums[i] / 10;
            }
        }
        int val = Math.abs(sum - sum2);
        return val;
    }
}