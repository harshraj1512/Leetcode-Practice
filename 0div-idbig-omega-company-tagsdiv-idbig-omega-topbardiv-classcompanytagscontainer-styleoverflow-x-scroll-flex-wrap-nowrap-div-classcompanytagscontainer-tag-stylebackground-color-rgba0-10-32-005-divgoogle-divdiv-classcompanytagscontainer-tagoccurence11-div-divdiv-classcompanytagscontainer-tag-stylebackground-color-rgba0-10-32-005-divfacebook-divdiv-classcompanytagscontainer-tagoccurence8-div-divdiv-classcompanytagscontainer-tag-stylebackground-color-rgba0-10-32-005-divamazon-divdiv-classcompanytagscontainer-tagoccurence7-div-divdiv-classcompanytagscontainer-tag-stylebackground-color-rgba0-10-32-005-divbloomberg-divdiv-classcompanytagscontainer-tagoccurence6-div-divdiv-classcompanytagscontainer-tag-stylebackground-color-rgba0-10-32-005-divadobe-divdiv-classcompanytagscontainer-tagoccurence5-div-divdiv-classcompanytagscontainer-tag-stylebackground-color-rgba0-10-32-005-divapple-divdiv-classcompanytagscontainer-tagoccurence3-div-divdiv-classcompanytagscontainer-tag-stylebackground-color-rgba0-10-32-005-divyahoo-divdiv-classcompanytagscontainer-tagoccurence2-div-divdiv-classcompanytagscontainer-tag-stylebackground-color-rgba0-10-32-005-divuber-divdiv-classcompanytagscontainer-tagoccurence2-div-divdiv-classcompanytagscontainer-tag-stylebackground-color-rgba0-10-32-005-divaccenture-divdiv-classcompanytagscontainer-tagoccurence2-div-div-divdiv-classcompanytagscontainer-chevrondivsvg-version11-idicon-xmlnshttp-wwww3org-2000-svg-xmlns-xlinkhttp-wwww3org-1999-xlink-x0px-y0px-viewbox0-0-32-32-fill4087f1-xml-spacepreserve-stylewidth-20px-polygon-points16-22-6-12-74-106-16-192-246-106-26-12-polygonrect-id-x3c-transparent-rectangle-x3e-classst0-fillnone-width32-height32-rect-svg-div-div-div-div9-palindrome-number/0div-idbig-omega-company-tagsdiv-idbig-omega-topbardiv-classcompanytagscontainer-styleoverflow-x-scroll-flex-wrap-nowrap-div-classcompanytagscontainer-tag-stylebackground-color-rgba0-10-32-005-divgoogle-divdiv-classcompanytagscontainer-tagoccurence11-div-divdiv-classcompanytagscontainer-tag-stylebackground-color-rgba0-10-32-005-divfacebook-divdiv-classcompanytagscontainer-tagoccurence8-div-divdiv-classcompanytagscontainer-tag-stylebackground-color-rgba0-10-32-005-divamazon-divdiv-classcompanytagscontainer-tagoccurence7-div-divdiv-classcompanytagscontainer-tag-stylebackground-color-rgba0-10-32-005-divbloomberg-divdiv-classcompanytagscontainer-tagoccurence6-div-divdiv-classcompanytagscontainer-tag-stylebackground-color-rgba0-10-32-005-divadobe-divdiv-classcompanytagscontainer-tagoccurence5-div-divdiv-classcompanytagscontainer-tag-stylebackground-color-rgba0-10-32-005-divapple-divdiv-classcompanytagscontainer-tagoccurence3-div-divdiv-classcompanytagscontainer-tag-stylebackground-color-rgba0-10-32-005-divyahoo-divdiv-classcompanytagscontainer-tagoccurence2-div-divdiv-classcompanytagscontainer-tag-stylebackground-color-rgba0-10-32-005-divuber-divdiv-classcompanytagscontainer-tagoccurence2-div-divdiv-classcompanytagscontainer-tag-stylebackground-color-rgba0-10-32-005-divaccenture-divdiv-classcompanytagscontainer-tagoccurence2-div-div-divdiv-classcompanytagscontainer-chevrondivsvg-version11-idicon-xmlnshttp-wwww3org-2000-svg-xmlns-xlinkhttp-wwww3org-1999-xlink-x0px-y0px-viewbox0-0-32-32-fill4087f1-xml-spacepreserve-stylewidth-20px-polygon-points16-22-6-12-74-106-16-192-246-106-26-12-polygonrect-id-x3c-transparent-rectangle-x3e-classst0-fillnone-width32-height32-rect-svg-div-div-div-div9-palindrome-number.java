class Solution {
    public boolean isPalindrome(int x) {
       StringBuilder test = new StringBuilder();

        StringBuilder s = new StringBuilder(String.valueOf(x));

        for (int i = s.length() -1 ; i >= 0 ; i--){
            test.append(s.substring(i , i+1));
        }

    
      return test.toString().equals(s.toString());
    }
}