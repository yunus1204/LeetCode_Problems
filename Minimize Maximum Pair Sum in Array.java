class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int start=0;
        int end=nums.length-1,max=0;
        while(start<end)
        {
            int m=nums[start]+nums[end];
            max=Math.max(max,m);
            start++;
            end--;
        }
        return max;
    }
}
