class Solution {
    public boolean detectCapitalUse(String word) {
       char[] as = word.toCharArray();
       if(as.length<2) return true;

       if(Character.isUpperCase(as[0])){
        if(Character.isUpperCase(as[1])){
           for(int i = 2; i<as.length; i++){
               if(!Character.isUpperCase(as[i])) return false;
           }                     
        }else{
           for(int i = 2; i<as.length; i++){
               if(Character.isUpperCase(as[i])) return false;
           }
        }
       }

       else{
           for(int i = 1; i<as.length; i++){
               if(Character.isUpperCase(as[i])) return false;
           }
       }
        return true;
    }
}