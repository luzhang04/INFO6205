// Leetcode 1021
package Week2;

public class RemoveOutermostParentheses {
    public String removeOuterParentheses(String S) {
        StringBuilder sb = new StringBuilder();
        int n = 0;
        for (Character ch : S.toCharArray()) {
            if (ch == '(' && n++ > 0) {
                sb.append(ch);
            }
            if (ch == ')' && n-- > 1) {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
