class Solution {
    public String addBinary(String a, String b) {
        int i=a.length()-1;
        int j=b.length()-1;
        int carry=0;
        String res="";
        int sum=0;
        while(i>=0 || j>=0)
        {
            int c1=0,c2=0;
            if(i>=0)
            {
                c1=a.charAt(i)-'0';
                i--;
            }
            if(j>=0)
            {
                c2=b.charAt(j)-'0';
                j--;
            }
            sum=carry+c1+c2;
            if(sum>1) carry=1;
            else carry=0;
            if(sum%2==0)
            {
                res="0"+res;
            }
            else
            {
                res="1"+res;
            }

        }
        if(carry>0)
        {
            res="1"+res;
        }
        return res;
    }
}
