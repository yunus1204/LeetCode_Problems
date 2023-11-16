import java.util.ArrayList;
import java.util.List;

public class Solution {
    public String findDifferentBinaryString(String[] nums) {
        List<Integer> l = new ArrayList<>();
        
        for (String s : nums) {
            int a = Integer.parseInt(s, 2);
            l.add(a);
        }
        
        int n = nums.length;
        
        for (int i = 0; i < Math.pow(2, n); i++) {
            if (!l.contains(i)) {
                String x = Integer.toBinaryString(i);
                
                while (x.length() < n) {
                    x = "0" + x;
                }
                
                return x;
            }
        }
        
        return "";
    }
}
