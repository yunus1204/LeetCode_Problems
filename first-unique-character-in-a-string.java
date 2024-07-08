class Solution {
    public int firstUniqChar(String s) {
        int res[]=new int[26];
        char str[]=s.toCharArray();

        for(char i:str)
        {
            res[i-'a']++;
        }

        for(int i=0;i<str.length;i++)
        {
            if(res[str[i]-'a']==1)
                return i;
        }
        return -1;
    }
}
