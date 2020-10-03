// Leetcode 316
package Week2;

import java.util.Deque;
import java.util.LinkedList;

public class RemoveDeplicateLetters {
    public String removeDuplicateLetters(String s) {
        if (s == null || s.length() == 0) return s;
        Deque<Character> deque = new LinkedList<>();
        int[] count = new int[26];
        boolean[] visited = new boolean[26];

        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }

        for (char c : s.toCharArray()) {
            if (visited[c - 'a']) {
                count[c - 'a']--;
                continue;
            }
            while (deque.size() > 0 && c < deque.peekLast() && count[deque.peekLast() - 'a'] > 0) {
                visited[deque.pollLast() - 'a'] = false;
            }
            deque.offerLast(c);
            count[c - 'a']--;
            visited[c - 'a'] = true;
        }

        StringBuilder sb = new StringBuilder();
        while (deque.size() > 0) {
            sb.append(deque.pollFirst());
        }
        return sb.toString();
    }
}
