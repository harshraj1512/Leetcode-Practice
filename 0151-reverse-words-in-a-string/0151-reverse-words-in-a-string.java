class Solution {
    public String reverseWords(String s) {
        String[] str = null;
        str = s.split("\\s+");
        String bla = "";
        for (int i = str.length-1; i >=0 ; i--) {
            bla += (str[i] + " ");

        }
        String a = bla.trim();
        return a;
    }
}