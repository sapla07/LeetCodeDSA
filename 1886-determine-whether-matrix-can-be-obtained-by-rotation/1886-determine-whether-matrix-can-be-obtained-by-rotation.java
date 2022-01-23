class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {      
        
        for(int i=0; i<4; i++){
            if(Arrays.deepEquals(mat, target))
                return true;
            mat = rotatematrix(mat);
        }              
       
        return false;
        
    }
    
     public static int[][] rotatematrix(int[][] mat){
        
         int n = mat.length;
         int[][] rotatedMatrix = new int[n][n];
         
         for(int i=0; i< n; i++){
             for(int j=0; j< n; j++){
                 /* new row = prev col 
                    new col = n-1- prev row */
                 rotatedMatrix[j][n-1-i] = mat[i][j];
                 
             }
         }
         
         return rotatedMatrix;
    }
    
    
}