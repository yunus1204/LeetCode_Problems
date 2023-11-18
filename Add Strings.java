import java.math.BigInteger;

class Solution {
    public String addStrings(String num1, String num2) {
        // Convert input strings to BigIntegers
        BigInteger a = new BigInteger(num1);
        BigInteger b = new BigInteger(num2);

        // Calculate the sum
        BigInteger c = a.add(b);

        // Convert the sum back to a string and return
        return c.toString();
    }
}
