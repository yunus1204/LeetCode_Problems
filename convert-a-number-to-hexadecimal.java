class Solution {
    public String toHex(int num) {
        if (num == 0) {
            return "0";
        }
        // else if(num<0) return "ffffffff";

        HashMap<Integer, String> map = new HashMap<>();
        map.put(0, "0");
        map.put(1, "1");
        map.put(2, "2");
        map.put(3, "3");
        map.put(4, "4");
        map.put(5, "5");
        map.put(6, "6");
        map.put(7, "7");
        map.put(8, "8");
        map.put(9, "9");
        map.put(10, "a");
        map.put(11, "b");
        map.put(12, "c");
        map.put(13, "d");
        map.put(14, "e");
        map.put(15, "f");

        StringBuilder res = new StringBuilder();
          while (num != 0) {
            int rem = num & 15;  // Get the last 4 bits
            res.append(map.get(rem));
            num >>>= 4;  // Unsigned right shift by 4 bits
        }

        return res.reverse().toString();  // Reverse the result to get the correct order
    }
}
