class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> spiral=new ArrayList<>();
        int m=matrix.length;
        int n=matrix[0].length;
        int rowstart=0,colend=n-1,rowend=m-1,colstart=0;
        // int count=0;
        int d=0;
        while(rowstart<=rowend && colstart<=colend) // or count<m*n or rowstart<=rowend && colstart<=colend                                                           
        {
            if(d==0){
                for(int i=colstart;i<=colend;i++)
                {
                    spiral.add(matrix[rowstart][i]);
                    // count++;
                }
                rowstart++;
                d=1;
            }
            else if(d==1){
                for(int i=rowstart;i<=rowend;i++)
                {
                    spiral.add(matrix[i][colend]);
                    // count++;
                }
                colend--;
                d=2;
            }
            else if(d==2){
                for(int i=colend;i>=colstart;i--)
                {
                    spiral.add(matrix[rowend][i]);
                    // count++;
                }
                rowend--;
                d=3;
            }
            else if(d==3) {
                for(int i=rowend;i>=rowstart;i--)
                {
                    spiral.add(matrix[i][colstart]);
                    // count++;
                }
                colstart++;
                d=0;
            }

            
        }
        return spiral;

    }
  
}
