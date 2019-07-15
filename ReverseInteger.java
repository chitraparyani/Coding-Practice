class ReverseInteger {
    public int reverse(int x) {
        
        int res = 0, rem = 0, prev = 0;
        
        while(x != 0){
            
            rem = x%10;
            res = res * 10 + rem;
            
            if((res-rem)/10 != prev)
                return 0;
            x = x/10;
            prev = res;
            
        }
        return res;
    }
}