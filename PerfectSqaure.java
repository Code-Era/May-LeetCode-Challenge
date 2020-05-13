class PerfectSqaure {
    public boolean isPerfectSquare(int num) {
        var value = Math.sqrt(num);
        
        return (value - Math.floor(value)  == 0);
    }
    // add normal method
    public static boolean isSquare(int n){
        if(n==0 || n==1)
            return true;
        for (int i = 0; i <n/2 ; i++) {
            int x = i*i;
            if(x==n)
                return true;
            else if (n<x)
                return false;
            else
                continue;
        }
        return false;
    }
}
