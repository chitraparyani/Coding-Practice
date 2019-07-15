class IntegerToRoman {
    public String intToRoman(int num) {
        
        if(num == 0)
            return " ";
        
        int[] nums = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] str = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX","V", "IV", "I"};
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < nums.length; i++){
            
            while(num >= nums[i]){
                sb.append(str[i]);
                num = num - nums[i];
            }
        }
        return sb.toString();   
    }
}