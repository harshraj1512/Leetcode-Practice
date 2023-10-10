class Solution {
    public int[] decompressRLElist(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0; i< nums.length; i = i+2){
            for(int j =0; j<nums[i]; j++){
                ans.add(nums[i+1]);
            }
        }
        int[] arr = new int[ans.size()];
        for(int i = 0; i<ans.size(); i++){
            arr[i] = ans.get(i);
        }
        return arr;
    }
}