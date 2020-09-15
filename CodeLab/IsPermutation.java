// Check Permutation: Given two strings, write a method to decide if one is a permutation of the other


import java.util.Arrays;

public class IsPermutation {
    boolean IsPermutation(String str1, String str2) {
        if(str1.length() != str2.length()) {
            return false;
        }
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        for (int i = 0; i < ch1.length - 1; i++) {
            if (ch1[i] != ch2[i]) {
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args) {
        IsPermutation ip = new IsPermutation();
        System.out.println(ip.IsPermutation("adiuf", "daesf"));
    }


}
