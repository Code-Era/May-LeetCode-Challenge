class PerfectSqaure {
    public boolean isPerfectSquare(int num) {
        var value = Math.sqrt(num);
        
        return (value - Math.floor(value)  == 0);
    }
}
