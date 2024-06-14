// class Solution {
//     public int minIncrementForUnique(int[] nums) {
//         Arrays.sort(nums);
//         int n=nums.length,count=0;
//         for(int i=0;i<n;i++)
//         {
//             for(int j=0;j<n;j++)
//             {
//                 if(i!=j)
//                 {
//                     if(nums[i]==nums[j])
//                     {
//                         nums[j]=nums[j]+1;
//                         count++;
//                     }
//                 }
//             }
//         }
//         return count;
//     }
// }
import java.util.Arrays;

class Solution {
    public int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= nums[i - 1]) {
                int increment = nums[i - 1] - nums[i] + 1;
                nums[i] += increment;
                count += increment;
            }
        }
        return count;
    }
}
