class Solution {
    public String intToRoman(int num) {
          HashMap<Integer,String> map=new HashMap<>();
          map.put(1,"I");
          map.put(4,"IV");
          map.put(5,"V");
          map.put(9,"IX");
          map.put(10,"X");
          map.put(40,"XL");
          map.put(50,"L");
          map.put(90,"XC");
          map.put(100,"C");
          map.put(400,"CD");
          map.put(500,"D");
          map.put(900,"CM");
          map.put(1000,"M");
          
        int numarr[]={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        StringBuilder str=new StringBuilder();
        for(int i=0;i<numarr.length;i++)
        {
            if(num>=numarr[i])
            {
                int div=num/numarr[i];
                for(int j=0;j<div;j++)
                {
                    str.append(map.get(numarr[i]));
                }
                num=num%numarr[i];
            }
        }
        return str.toString();
    }
}




// class Solution {
//     public String intToRoman(int num) {
//         HashMap<Integer,String> map=new HashMap<>();
//         map.put(1000,"M");
//         map.put(900,"CM");
//         map.put(500,"D");
//         map.put(400,"CD");
//         map.put(100,"C");
//         map.put(90,"XC");
//         map.put(50,"L");
//         map.put(40,"XL");
//         map.put(10,"X");
//         map.put(9,"IX");
//         map.put(5,"V");
//         map.put(4,"IV");
//         map.put(1,"I");
//         StringBuilder str=new StringBuilder();
//         int arr[]={1000,900,500,400,100,90,50,40,10,9,5,4,1};
//         for(int i=0;i<arr.length;i++)
//         {
//             int rem=num/arr[i];
//             for(int k=0;k<rem;k++)
//             {
//                 str.append(map.get(arr[i]));
//             }
//             num=num%arr[i];
//         }
//         return str.toString();
//     }
// }    
