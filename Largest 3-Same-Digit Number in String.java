class Solution {
    public String largestGoodInteger(String num) {
        int max=0;
        char arr[]=num.toCharArray();
        int n=arr.length,start=0,end=0;
        for(int i=0;i<n-2;i++)
        {
            if(arr[i]==arr[i+1] && arr[i+1]==arr[i+2] && arr[i+2]==arr[i])
            {
                if(max<arr[i]){
                max=(char)Math.max(max,arr[i]);
                start=i;
                end=i+2;}
            }
        }
        if(max!=0)
        return num.substring(start,end+1);
        else return "";
    }
}
