class Solution {
    public List<Integer> findDuplicates(int[] nums) {
       Arrays.sort(nums);
        int great = nums[nums.length-1];
        int[] freq = new int[great+1];
        ArrayList<Integer> res = new ArrayList<>();
        for(int i = 0; i< nums.length; i++){
            freq[nums[i]]++;
        }
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] == 2){
                res.add(i);
            }
        }
        return res; 
    }
}