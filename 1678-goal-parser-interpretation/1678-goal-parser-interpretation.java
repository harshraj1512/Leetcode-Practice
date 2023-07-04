class Solution {
    public String interpret(String command) {
      String s ="";
        for (int i = 0; i < command.length(); i++) {
            if (command.charAt(i) == 'G'){
                s += 'G';
            } else if (command.charAt(i) == '(' && command.charAt(i+1) == ')') {
                s+=  'o';
            } else if (command.charAt(i) == '(' && command.charAt(i+1) == 'a' && command.charAt(i+2)=='l' && command.charAt(i+3) ==')') {
                s+="al";
            }

        }
        return s;  
    }
}