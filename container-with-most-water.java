class Solution {
    public int maxArea(int[] height) {
        // int n=height.length;
        // int max=0;
        // for(int i=0;i<n;i++)
        // {
        //     for(int j=i+1;j<n;j++)
        //     {
        //         int h=Math.min(height[i],height[j]);
        //         int b=j-i;
        //         int area=h*b;
        //         max=Math.max(max,area);
        //     }
        // }
        // return max;     // Time Limit Exceeded

        int start=0;
        int end=height.length-1,max=0;
        while(start<end)
        {
            int b=end-start;
            int h=Math.min(height[start],height[end]);
            int area=b*h;
            max=Math.max(max,area);
            if(height[start]<height[end])
            {
                start++;
            }
            else
            {
                end--;
            }
        }
        return max;
    }
}
