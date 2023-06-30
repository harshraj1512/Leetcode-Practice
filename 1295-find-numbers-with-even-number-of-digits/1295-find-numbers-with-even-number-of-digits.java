class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int i = 0;i<nums.length; i++){
            if(fun(nums[i]) % 2 ==  0){
                count++;
            }
        }
        return count;
    }

    static int fun(int i){
        int count1 =0;
        while(i>0){
            i = i/10;
            count1++;
        }
        return count1;
    }
}