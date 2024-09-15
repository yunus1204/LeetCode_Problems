class Solution {
    public int missingNumber(int[] nums) {
        int tot=0;
        for(int i:nums) tot+=i;
        int sum=0;
        for(int i=1;i<=nums.length;i++) sum+=i;
        return sum-tot;
    }
}
