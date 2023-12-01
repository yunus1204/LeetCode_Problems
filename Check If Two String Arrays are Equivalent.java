class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String s1=new String();
        String s2=new String();
        for(String i:word1)
        {
            s1+=i;
        }
        for(String j:word2)
        {
            s2+=j;
        }
   
        return (s1).equals(s2);
    }
}
