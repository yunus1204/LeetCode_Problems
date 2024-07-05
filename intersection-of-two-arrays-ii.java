class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> res=new ArrayList<>();
        int i=0,j=0;
        while(i<nums1.length && j<nums2.length)
        {
            if(nums1[i]<nums2[j]) i++;
            else if(nums2[j]<nums1[i]) j++;
            else {
                res.add(nums1[i]);
                i++;
                j++;
            }
        }
        int inter[]=new int[res.size()];
        for(int k=0;k<inter.length;k++){
            inter[k]=res.get(k);
        }
        return inter;
    }
}
