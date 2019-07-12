class LongestPalindrome {
    public String longestPalindrome(String s) {
        
        if(s.length()==0)
            return "";
        
        int len = s.length();
        
        boolean[][] dp = new boolean[len][len];
        
        int m = 0, n= 0;
        
        for(int i = 0; i < s.length(); i++)
            dp[i][i] = true;
        
        for(int j = 1; j < s.length(); j++){
            
            for(int i = 0; i < j; i++){
                
                boolean isInnerPalindrome = dp[i+1][j-1] || j - i < 2;
                
                if(s.charAt(i) == s.charAt(j) && isInnerPalindrome){
                    dp[i][j] = true;
                    
                    if(n-m < j-i){
                        n = j;
                        m = i;
                    }
                }
            }
        }
        return s.substring(m, n+1);
    }
}