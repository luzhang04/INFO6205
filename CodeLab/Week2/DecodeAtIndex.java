// Leetcode 880
package Week2;

public class DecodeAtIndex {
    public static String decodeAtIndex(String S, int K) {
        long size = 0;

        for (int i = 0; i < S.length(); ++i) {
            char c = S.charAt(i);
            if (Character.isDigit(c)) {
                size *= c - '0';
            }
            else {
                size++;
            }
        }

        for (int j = S.length() - 1; j >= 0; --j) {
            char s = S.charAt(j);
            K %= size;
            if (K == 0 && Character.isLetter(s)) {
                return Character.toString(s);
            }

            if (Character.isDigit(s)) {
                size /= (s - '0');
            }
            else {
                size--;
            }
        }
        return null;
    }
}
