class Solution {
    public int[][] transpose(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int[][] finalMatrix=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                finalMatrix[i][j]=matrix[j][i];
            }
        }
        return finalMatrix;

    }
}
