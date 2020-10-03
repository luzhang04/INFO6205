// Leetcode 70
package Week2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class SimplifyPath {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        Set<String> set = new HashSet<String>(Arrays.asList(".", "..", ""));
        for (String str : path.split("/")) {
            if (str.equals("..") && ! stack.isEmpty()) {
                stack.pop();
                
            }
            else if (! set.contains(str)) {
                stack.push(str);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (String s : stack) {
            sb.append("/" + s);
        }
        return sb.length() == 0 ? "/" : sb.toString();
    }
}
