class Solution {
    public int getXORSum(int[] arr1, int[] arr2) {
        int x1=0,x2=0;
        for(int i:arr1)
        {
            x1^=i;
        }
        for(int j:arr2)
        {
            x2^=j;
        }
        return x1&x2;
    }
}
