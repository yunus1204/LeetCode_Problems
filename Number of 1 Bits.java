public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        String s = Integer.toBinaryString(n);
        int co = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                co++;
            }
        }

        return co;
    }
}
