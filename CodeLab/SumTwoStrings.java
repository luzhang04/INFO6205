//Sum of two Strings: Given two non-negative integers num1 and num2 represented as string,
// return the sum of num1 and num2.

public class SumTwoStrings {

    public static void main(String[] args) {
        String num1 = "1", num2 = "4", result;
        int val = Integer.parseInt(num1) + Integer.parseInt(num2);
        result = String.valueOf(val);
        System.out.println(result);
    }



}
