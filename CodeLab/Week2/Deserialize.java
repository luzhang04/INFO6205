// Leetcode 385
package Week2;

import java.util.LinkedList;
import java.util.List;

public interface NestedInteger {

    public NestedInteger();

    public NestedInteger(int value);

    public boolean isInteger();

    public Integer getInteger();

    public void setInteger(int value);

    public void add(NestedInteger ni);

    public List<NestedInteger> getList();
}


 class Deserialize {


    public NestedInteger deserialize(String s) {
        if (s == null || s.length() == 0) {
            return new NestedInteger();
        }

        if (s.charAt(0) != '[') {
            return new NestedInteger(Integer.valueOf(s));
        }

        if (s.equals("[]")) {
            return new NestedInteger();
        }

        String content = s.substring(1, s.length() - 1);
        int stack = 0;
        int start = 0;
        List<String> elements = new LinkedList<>();
        for (int i = 0; i < content.length(); i++) {
            if (content.charAt(i) == '[') {
                stack++;
            } else if (content.charAt(i) == ']') {
                stack--;
            } else if (content.charAt(i) == ',' && stack == 0) {
                elements.add(content.substring(start, i));
                start = i + 1;
            }
        }
        elements.add(content.substring(start, content.length()));

        NestedInteger res = new NestedInteger();
        for (String e : elements) {
            res.add(deserialize(e));
        }

        return res;
    }
}
