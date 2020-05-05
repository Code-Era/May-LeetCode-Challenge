class JewelStones {
    public int numJewelsInStones(String J, String S) {
        
        int count = 0;
        
        for (char s : S.toCharArray()){
            
            for(char a : J.toCharArray()){
                if(s == a)
                    count++;
                
            }  
        }
        
        return count;
    }
}
