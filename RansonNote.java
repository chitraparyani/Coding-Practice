class RansonNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        int[] charmap = new int[26];
        
        for(int i = 0; i < magazine.length(); i++){            
            int temp = magazine.charAt(i) - 'a';
            charmap[temp]++;            
        }
        
        for(int j = 0; j < ransomNote.length(); j++){
            int temp = ransomNote.charAt(j) - 'a';
            --charmap[temp];
        }
        
        for(int k = 0; k < 26; k++){
            if(charmap[k] < 0)
                return false;
        }
        
        return true;
    }
}