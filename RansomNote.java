class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        char [] ransomNoteArray = ransomNote.toCharArray();
        
        for(char c : ransomNoteArray){
            
           int  index = magazine.indexOf(c);
            if(index == -1){
                return false;
            }
            magazine = magazine.substring(0, index)  + magazine.substring(index+1, magazine.length());  
            
        }
        return true;
    }
}
