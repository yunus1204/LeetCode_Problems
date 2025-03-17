class Solution {
    public boolean divideArray(int[] nums) {
        int flag=0;
        int n=nums.length;
        if(nums.length%2!=0) return false;
        else{
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                if(arr[i]!=1){
                for(int j=i+1;j<n;j++)
                {
                    if(nums[i]==nums[j] && arr[i]!=1 && arr[j]!=1)
                    {
                        arr[i]=1;
                        arr[j]=1;
                        flag++;
                        break;
                    }
                }
            }
            }
        }
        return flag==n/2;
    }
}
