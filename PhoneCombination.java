class PhoneCombination {
    public List<String> letterCombinations(String digits) {
        
        if(digits.length() == 0)
            return Arrays.asList();
        
        HashMap<Character, String> map = new HashMap<>();
        
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        
        List<String> result = new ArrayList();        
        combinations(result, map, new StringBuilder(), digits);
        return result;
    }
    
    public void combinations(List<String> result, HashMap<Character, String> map, StringBuilder sb, String digits){
        
        if(sb.length() == digits.length()){
            result.add(sb.toString());
            return;
        }
        
        
            
            String temp = map.get(digits.charAt(sb.length()));
            for(int i = 0; i < temp.length(); i++){
            sb.append(temp.charAt(i));
            combinations(result, map, sb, digits);
            sb.deleteCharAt(sb.length()-1);
        }
        
    }
}