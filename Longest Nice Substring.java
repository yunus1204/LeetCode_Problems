class Solution {
    public String longestNiceSubstring(String s) {
        HashSet<Character> set=new HashSet<>();
        int n=s.length();
        for(int i=0;i<n;i++)
        {
            set.add(s.charAt(i));
        }
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(!set.contains(Character.toUpperCase(c)) || !set.contains(Character.toLowerCase(c)))
            {
                String s1=longestNiceSubstring(s.substring(0,i));
                String s2=longestNiceSubstring(s.substring(i+1));
                return s1.length()>=s2.length() ? s1:s2;            }
        }
        return s;
    }
}
