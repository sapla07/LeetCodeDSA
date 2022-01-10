class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        
       
        int col = image[0].length;
        int[][] store = new int[image.length][col];
        
        for(int i=0; i < image.length; i++){            
            for(int j=0 ; j < col; j++){                                                      store[i][j] =  image[i][col-j-1];             
            }
        }
        
        for(int i=0; i < image.length; i++){            
            for(int j=0 ; j< image[i].length ; j++){
                
                store[i][j] = store[i][j] == 0? 1: 0;
            }
        }
        
        return store;
        
        
    }    
   
}