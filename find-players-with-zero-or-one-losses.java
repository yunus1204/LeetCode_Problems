public class Solution {
    public List<List<Integer>> findWinners(int[][] mat) {
        List<List<Integer>> ans = new ArrayList<>();

        int m = mat.length;
        int n = mat[0].length;
        int max = Integer.MIN_VALUE;

        // Find the maximum element in the matrix
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (max < mat[i][j]) {
                    max = mat[i][j];
                }
            }
        }

        // Initialize the array with size max + 1
        int[] arr = new int[max + 1];

        // Count occurrences of each element in the last column of the matrix
        for (int ar[] : mat) {
            int p = ar[ar.length - 1];
            arr[p] += 1;
        }

        // Separate the winners into two lists
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();

        for (int i = 1; i <= max; i++) {
            if (arr[i] == 0) {
                l1.add(i);
            } else if (arr[i] == 1) {
                l2.add(i);
            }
        }

        ans.add(l1);
        ans.add(l2);

        return ans;
    }
}
