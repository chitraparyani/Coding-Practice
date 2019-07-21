class ReverseVowelsInString {
    public String reverseVowels(String s) {
        
        if(s.length() == 0)
            return "";
        
        HashSet<Character> set = new HashSet<>();
        
        set.add('a');   
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('A');   
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');
        
        int i = 0, j = s.length()-1;
        
        char[] ch = s.toCharArray();
        while(i <= j){
            
            if(!set.contains(s.charAt(i)))
                i++;
            else if(!set.contains(s.charAt(j)))
                j--;
            else{
                
                char temp = ch[i];
                ch[i] = ch[j];
                ch[j] = temp;
                i++;
                j--;
            }
        }
        
        String s1 = new String(ch);
        
        return s1;
    }
}