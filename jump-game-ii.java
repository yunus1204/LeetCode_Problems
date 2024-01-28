class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        int jumps = 0;
        int currentJumpEnd = 0;
        int farthest = 0;

        for (int i = 0; i < n - 1; i++) {
            farthest = Math.max(farthest, i + nums[i]);

            if (i == currentJumpEnd) {
                jumps++;
                currentJumpEnd = farthest;

                if (currentJumpEnd >= n - 1) {
                    break;  // Reached or surpassed the last index
                }
            }
        }

        return jumps;
    }
}
