class FirstUniqueChar {
    public int firstUniqChar(String s) {
       
        var map = new LinkedHashMap<Character, Integer>();
        
        for (Character c : s.toCharArray()){
             map.put(c , map.containsKey(c) ? map.get(c)+1 : 1);
        }
        
        for (int i = 0; i < s.length(); i++) {
             if (map.get(s.charAt(i)) == 1) 
                return i;
            }
        
        return -1;
   }
}
