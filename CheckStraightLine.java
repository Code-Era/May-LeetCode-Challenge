class CheckStraightLine {
    public boolean checkStraightLine(int[][] coordinates) {
     
        float slope  = getSlope(coordinates[0], coordinates[1]);
        for(int i = 2 ; i < coordinates.length ; ++i){
             float k = getSlope(coordinates[i], coordinates[0]);
            if(k != slope)
                return false;
        }
        return true;
    }
    
    
    public float getSlope(int[] p1, int [] p2){
        
        if(p1[0] == p2[0]){
            return 100000;
        }
        return (float) (p2[1] -p1[1] )/(p2[0] - p1[0]);
    }
}
