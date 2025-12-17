class Solution {
    public String removeOuterParentheses(String s) {
        String result = "";
        int count = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                if (count > 0) result += ch;

                count++;
            } else {
                count--;
                if (count > 0) result += ch;
            }        
        }
        return result;
    }
}
