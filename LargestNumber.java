class LargestNumber {
    
    public class LargestNumberComparator implements Comparator<String> {
        
        @Override
        public int compare(String s1, String s2){
            
            String o1 = s1 + s2;
            String o2 = s2 + s1;
            
            return o2.compareTo(o1);
        }
    }
    
    public String largestNumber(int[] nums) {
    
        String[] strarr = new String[nums.length];
        
        for(int i = 0; i < nums.length; i++){
            
            strarr[i] = String.valueOf(nums[i]);
        }
        
        LargestNumberComparator comparator = new LargestNumberComparator();
        
        Arrays.sort(strarr, comparator);
        
        if(strarr[0].equals("0"))
            return "0";
        
        StringBuilder sb =  new StringBuilder();
        for(String str : strarr){
            sb.append(str);
        }
        return sb.toString();
    }
}