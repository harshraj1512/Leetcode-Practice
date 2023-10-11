class Solution {
    public String truncateSentence(String s, int k) {
        String[] str = s.split(" ");
        String ans = "";
        for(int i = 0; i < k; i++){
            ans += str[i] + " ";
        }
        String ans1 = ans.trim();
        return ans1;
    }
}