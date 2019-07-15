class ZigZagPattern {
    public String convert(String s, int numRows) {
        
        if(numRows == 1) return s;
        
        List<StringBuilder> list = new ArrayList();
        
        for(int i = 0; i < Math.min(numRows, s.length()); i++)
            list.add(new StringBuilder());
        
        int current = 0;
        boolean down = false;
        
        for(int j = 0; j < s.length(); j++){
            
            list.get(current).append(s.charAt(j));
            
            if(current == 0 || current == numRows-1) down = !down;
            
            if(down)
                current += 1;
            else
                current -= 1;
            
        }
        
        StringBuilder sb = new StringBuilder();
        
        for(StringBuilder sbs : list)
            sb.append(sbs.toString());
        
        return sb.toString();
    }
}

//Time Complexity - O(n) -- where n is length of string
//Space Complexity - O(n) -- where n is length of string