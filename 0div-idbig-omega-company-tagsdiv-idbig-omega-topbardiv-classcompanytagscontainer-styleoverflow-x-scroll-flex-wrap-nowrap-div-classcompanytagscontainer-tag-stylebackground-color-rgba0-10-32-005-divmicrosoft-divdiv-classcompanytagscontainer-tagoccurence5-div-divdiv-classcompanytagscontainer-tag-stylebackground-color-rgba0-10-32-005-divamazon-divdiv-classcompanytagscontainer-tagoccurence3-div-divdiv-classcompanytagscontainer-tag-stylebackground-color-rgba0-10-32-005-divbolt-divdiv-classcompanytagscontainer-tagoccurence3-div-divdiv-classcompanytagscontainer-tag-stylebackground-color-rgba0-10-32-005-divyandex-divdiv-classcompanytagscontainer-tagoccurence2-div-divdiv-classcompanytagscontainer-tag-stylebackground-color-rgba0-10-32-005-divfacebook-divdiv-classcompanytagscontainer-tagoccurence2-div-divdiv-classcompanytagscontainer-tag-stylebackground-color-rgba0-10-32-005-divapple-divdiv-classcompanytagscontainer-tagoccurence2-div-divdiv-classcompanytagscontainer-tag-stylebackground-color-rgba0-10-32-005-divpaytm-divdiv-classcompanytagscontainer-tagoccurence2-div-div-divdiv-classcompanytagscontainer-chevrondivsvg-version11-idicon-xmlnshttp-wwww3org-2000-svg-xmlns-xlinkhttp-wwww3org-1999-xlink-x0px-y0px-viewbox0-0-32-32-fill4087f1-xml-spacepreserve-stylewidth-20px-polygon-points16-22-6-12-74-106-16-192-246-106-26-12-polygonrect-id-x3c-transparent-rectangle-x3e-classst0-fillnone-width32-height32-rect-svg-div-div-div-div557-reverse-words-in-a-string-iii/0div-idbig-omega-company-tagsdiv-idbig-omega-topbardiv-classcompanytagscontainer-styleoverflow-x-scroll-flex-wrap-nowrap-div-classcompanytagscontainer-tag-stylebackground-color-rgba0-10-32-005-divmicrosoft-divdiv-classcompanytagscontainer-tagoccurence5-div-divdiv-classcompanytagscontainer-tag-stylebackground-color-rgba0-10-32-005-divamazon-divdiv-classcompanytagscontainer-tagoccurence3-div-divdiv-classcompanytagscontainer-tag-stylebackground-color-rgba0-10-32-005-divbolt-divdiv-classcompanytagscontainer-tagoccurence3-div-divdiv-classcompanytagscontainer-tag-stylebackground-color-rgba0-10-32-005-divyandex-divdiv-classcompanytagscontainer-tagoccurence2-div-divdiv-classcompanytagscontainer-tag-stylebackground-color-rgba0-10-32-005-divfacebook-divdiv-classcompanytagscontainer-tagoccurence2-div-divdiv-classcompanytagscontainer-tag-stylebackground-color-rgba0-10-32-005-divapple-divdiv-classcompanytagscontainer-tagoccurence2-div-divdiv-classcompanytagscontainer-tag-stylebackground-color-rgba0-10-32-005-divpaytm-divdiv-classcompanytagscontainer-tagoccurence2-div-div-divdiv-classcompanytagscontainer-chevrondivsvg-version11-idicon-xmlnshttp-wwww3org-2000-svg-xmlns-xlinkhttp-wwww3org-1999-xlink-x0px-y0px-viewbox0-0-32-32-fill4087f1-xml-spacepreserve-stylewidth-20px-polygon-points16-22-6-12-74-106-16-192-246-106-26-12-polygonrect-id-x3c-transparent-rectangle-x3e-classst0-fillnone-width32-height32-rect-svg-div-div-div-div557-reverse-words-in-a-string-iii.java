class Solution {
    public String reverseWords(String s) {
       String[] str = s.split(" ");
       StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < str.length; i++) {
            StringBuilder temp = new StringBuilder(str[i]);
            if(i == str.length-1){
                sb.append(temp.reverse());
            }else{
                sb.append(temp.reverse() +" ");
            }
            
        }
        return sb.toString();
    }
}