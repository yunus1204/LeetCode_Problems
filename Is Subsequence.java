class Solution {
    public boolean isSubsequence(String s, String t) {
        char str1[]=s.toCharArray();
        char str2[]=t.toCharArray();
        int j=0,co=0;
        for(int i=0;i<str1.length;i++)
        {
            while(j<str2.length)
            {
                if(str1[i]==str2[j])
                {
                    co++;
                    j++;
                    break;
                }
                j++;
            }
        }
        if(co==str1.length) return true;
        else return false;
    }
}
