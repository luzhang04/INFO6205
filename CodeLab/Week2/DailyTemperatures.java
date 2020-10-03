// Leetcode 739
package Week2;

import java.util.Stack;

public class DailyTemperatures {
    class Entry {
        int temp;
        int day;
        Entry(int t, int day) {
            this.temp = t;
            this.day = day;
        }
    }

    public int[] dailyTemperatures(int[] temperatures) {
        int[] res = new int[temperatures.length];
        Stack<Entry> stack = new Stack<>();
        for (int i = 0; i < temperatures.length; i++) {
            if (stack.size() == 0 || stack.peek().temp >= temperatures[i]) {
                stack.push(new Entry(temperatures[i], i));
            } else {
                while (stack.size() > 0 && stack.peek().temp < temperatures[i]) {
                    Entry e = stack.pop();
                    res[e.day] = i - e.day;
                }
                stack.push(new Entry(temperatures[i], i));
            }
        }

        return res;
    }
}
