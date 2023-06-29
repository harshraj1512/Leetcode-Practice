class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] ans = new int[2];
        int i = 0;
        int j = numbers.length-1;
        int a = 0;
        while(i<j){
            if (numbers[i] + numbers[j] < target){
                i++;
            } else if (numbers[i] + numbers[j] > target) {
                j--;
            } else  {
                ans[a] = i+1;
                ans[a+1] = j+1;
                return ans;
            }

        }
        return new int[]{-1, -1};
    }
}