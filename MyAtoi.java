class MyAtoi {
    public int myAtoi(String str) {
              
        str = str.trim();
        
        if(str.length() == 0)
            return 0;
        
        boolean flag = false;
        int start = 0;
        if(str.charAt(0) == '+')
            start++;
        else if(str.charAt(0) == '-'){
            start++;
            flag = true;
        }
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = start; i < str.length(); i++){
            
            if(Character.isDigit(str.charAt(i)))
                sb.append(str.charAt(i));
            else
                break;            
        }
        
        if(sb.length() == 0)
            return 0;
        
        double res = Double.parseDouble(sb.toString());
        
        if(flag)
            res = -res;
        
        if(res > Integer.MAX_VALUE)
            return Integer.MAX_VALUE;
        else if(res < Integer.MIN_VALUE)
            return Integer.MIN_VALUE;
            
        return (int)res;
    }
}