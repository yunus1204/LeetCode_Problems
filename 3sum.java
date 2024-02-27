class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res=new ArrayList<>();
        Set<List<Integer>> s=new HashSet<>();
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            int j=i+1;
            int k=nums.length-1;
            while(j<k)
            {
                int sum=nums[i]+nums[j]+nums[k];
                if(sum==0)
                {
                    s.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                    k--;
                }
                else if(sum<0)
                {
                    j++;
                }
                else{
                    k--;
                }
            }
        }
        res.addAll(s);
        return res;
    }
}
