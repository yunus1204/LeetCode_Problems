class Solution {
    public int[] twoSum(int[] nums, int target) {
        int a[]=new int[2];
        int l=nums.length;
        for(int i=0;i<l;i++){
            int k=0;
            for (int j=i+1;j<l;j++){
                if(nums[i]+nums[j]==target){
                    a[k]=i;
                    a[k+1]=j;
                    break;
                }
               
            }
             if(k>0){
                    break;
                }
        }
        return a;
    }
}
