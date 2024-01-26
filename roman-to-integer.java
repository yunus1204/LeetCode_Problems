class Solution {
    public int value(char x){
        if(x=='I')
            return 1;
        else if(x=='V')
            return 5;
        else if(x=='X')
            return 10;
        else if(x=='L')
            return 50;
        else if(x=='C')
            return 100;
        else if(x=='D')
            return 500;
        else if(x=='M')
            return 1000;    
        return -1;        
    }
    public int romanToInt(String s) {
        int tot=0;

        for(int i=0;i<s.length();i++){
            int s1=value(s.charAt(i));
            if(i+1<s.length()){
                int s2=value(s.charAt(i+1));
            
                if(s1>=s2){
                    tot=tot+s1;
                }
                else{
                    tot=tot-s1;
                }
            }
            else
            {
                tot=tot+s1;
            }    
    

        }
        return tot;
    }
    
}
