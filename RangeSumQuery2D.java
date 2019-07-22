class RangeSumQuery2D {
    
    int[][] dp;

    public RangeSumQuery2D(int[][] matrix) {
        
        if(matrix.length == 0)
            return;
        
        int m = matrix.length;
        int n = matrix[0].length;
        
        dp = new int[m][n];
        
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                
                if(j == 0){
                    dp[i][j] = matrix[i][j];
                }else {
                    dp[i][j] = matrix[i][j] + dp[i][j-1];
                }                
            }
        }
        
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        
        int sum = 0;
        
        if(col1 > 0){
        while(row1 <= row2){
            
            sum += dp[row1][col2] - dp[row1][col1-1];
            row1++;
            }
        }else if(col1 == 0) {
            
            while(row1 <= row2){
                
                sum += dp[row1][col2];
                row1++;
            }
            
        }
        return sum;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */