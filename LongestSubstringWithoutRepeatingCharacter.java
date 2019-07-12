class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        
        HashSet<Character> set = new HashSet<>();
        
        int i = 0, j = 0;        
        int result = 0;
        
        while(j < s.length()){
            
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                
            result = Math.max(result, j-i);       
            
        }else {
                
                set.remove(s.charAt(i++));
            }
        
    }
        return result;
}
    
}