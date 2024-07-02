class Solution {
    public void moveZeroes(int[] nums) {
        int first = 0;
        for (int end = 0; end < nums.length; end++) {
            if (nums[end] != 0) {
                int temp = nums[first];
                nums[first] = nums[end];
                nums[end] = temp;
                first++;
            }
        }
    }
}
