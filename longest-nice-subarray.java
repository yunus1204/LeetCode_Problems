class Solution {
    public int longestNiceSubarray(int[] nums) {
        int n = nums.length, left = 0, right = 0, maxi = 0, mask = 0;
        while (right < n) {
            while ((mask & nums[right]) != 0) mask -= nums[left++];
            mask += nums[right];
            maxi = Math.max(maxi, right - left + 1);
            right++;
        }
        return maxi;
    }
}
