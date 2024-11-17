package String;

public class ValidParentheses {
    public static void main(String[] args) {
        String s = "[]}";
        Solution obj = new Solution();
        System.out.println(obj.isValid(s));
    }
}

class Solution {
    public boolean isValid(String s) {
        int length = s.length();
        int index = length - 1;
        for (int j = 0; j < s.length()-1; j++) {
            if (j == 0 && (s.charAt(j) == '('&& s.charAt(j+1) == ')'||s.charAt(index) == ')' )|| s.charAt(j ) == '{' &&s.charAt(j+1) == '}'||s.charAt(index) == '}'||s.charAt(j) == '['&&s.charAt(j+1) == ']'||s.charAt(index) == ']') {
                return true;
            }else{
            if (j != 0 && s.charAt(j) == '('&& s.charAt(j+1) == ')'||s.charAt(j ) == '{' &&s.charAt(j+1) == '}'||s.charAt(j) == '['&&s.charAt(j+1) == ']'){
            return true;
            }
                
        }
    }return false;
}}
