// Is Unique: Implement an algorithm to determine if a string has all unique characters.

import java.util.Arrays;

public class IsUnique {
    boolean IsUnique(String str) {
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        for (int i = 0; i < charArray.length - 1; i++) {
            if (charArray[i] != charArray[i + 1]) {
                continue;
            }
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        IsUnique iu = new IsUnique();
        System.out.println(iu.IsUnique("INFO6205"));
    }

}
