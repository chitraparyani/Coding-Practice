class PalindromeNumber {
    public boolean isPalindrome(int x) {
        
        if(x <0)
            return false;
        
        if(x == 0)
            return true;
        
        int rev = x;
        
        int rem = 0, res = 0;
        
        while(x != 0){
            
            rem = x % 10;
            res = res * 10 + rem;
            
            x = x/10;
        }
        
        if(res == rev)
            return true;
        
        return false;
    }
}