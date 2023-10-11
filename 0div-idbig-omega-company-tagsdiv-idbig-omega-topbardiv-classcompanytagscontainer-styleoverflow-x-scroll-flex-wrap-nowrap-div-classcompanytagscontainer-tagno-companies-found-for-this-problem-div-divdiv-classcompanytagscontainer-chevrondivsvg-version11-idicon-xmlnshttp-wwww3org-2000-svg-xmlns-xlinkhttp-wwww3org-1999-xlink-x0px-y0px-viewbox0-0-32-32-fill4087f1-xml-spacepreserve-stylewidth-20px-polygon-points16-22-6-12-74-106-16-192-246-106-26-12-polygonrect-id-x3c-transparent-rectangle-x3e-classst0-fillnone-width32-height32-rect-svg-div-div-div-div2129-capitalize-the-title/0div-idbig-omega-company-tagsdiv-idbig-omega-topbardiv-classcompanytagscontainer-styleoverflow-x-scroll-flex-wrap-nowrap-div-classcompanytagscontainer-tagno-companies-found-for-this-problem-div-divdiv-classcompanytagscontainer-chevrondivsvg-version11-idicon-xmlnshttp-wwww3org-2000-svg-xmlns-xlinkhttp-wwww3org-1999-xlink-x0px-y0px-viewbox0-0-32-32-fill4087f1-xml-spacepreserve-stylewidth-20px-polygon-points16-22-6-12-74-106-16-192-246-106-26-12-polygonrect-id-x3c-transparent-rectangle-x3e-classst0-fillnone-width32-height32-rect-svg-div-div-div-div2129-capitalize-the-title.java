class Solution {
    public String capitalizeTitle(String title) {
        String[] str = title.split(" ");
        String ans = "";
        for(int i = 0; i< str.length; i++){
            if(str[i].length() >= 3){
                ans+= str[i].substring(0,1).toUpperCase() + str[i].substring(1).toLowerCase() + " ";
            } else{
                ans += str[i].substring(0).toLowerCase() + " ";
            }
        }
        String ans1 = ans.trim();
        return ans1;
    }
}