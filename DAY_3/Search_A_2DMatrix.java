public class Search_A_2DMatrix {
    //brute force 
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                if(matrix[i][j]==target) return true;
            }
        }

        return false;
    }

    //optimised - approach

    public boolean searchMatrixOptimised(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        int l=0;
        int r = m*n-1;

        while(l<=r) {
            int mid = l+(r-l)/2;
            int row = mid/n;
            int col = mid%n;

            int midVal = matrix[row][col];

            if(midVal==target){
             return true;
            } else if (midVal<target) {
            l=mid+1;
            } else {
            r=mid-1;
            }
        }

         return false;
    }
}
