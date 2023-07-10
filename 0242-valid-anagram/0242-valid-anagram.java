class Solution {
    public boolean isAnagram(String s, String t) {
        char[] temp = s.toCharArray();
        Arrays.sort(temp);
        char[] temp2 = t.toCharArray();
        Arrays.sort(temp2);
        String s1 = String.valueOf(temp);
        String s2 = String.valueOf(temp2);

        if(s1.equals(s2)){
            return true;
        }

        return false;
    }
}