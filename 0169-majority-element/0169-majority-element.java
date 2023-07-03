class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int max = nums[nums.length-1];
        int[] freq = new int[max+1];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0){
                freq[nums[i]]++;
            }
        }
        int a = nums.length/2;
        for (int i = 0; i < freq.length; i++) {
            if (a < freq[i]){
                a = i;
                break;
            }
        }
        return a;
    }
}