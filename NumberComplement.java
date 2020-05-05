class NumberComplement {
    public int findComplement(int num) {
       int flipbits = 1;
        
        while(flipbits < num) {
            flipbits = (flipbits << 1) + 1;
        }
        
        return flipbits - num;
  
    }
    
}
