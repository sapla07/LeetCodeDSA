class Solution {
    public int maximumPopulation(int[][] logs) {
        
       int[] count = new int[101];
       int max = 0;
       int maxYear = 1950;
        
        for(int[] log : logs){
            for(int j=log[0]; j < log[1]; j++){
               count[j-1950]++;
             }            
        }
     
        
       for(int j=0; j < count.length; j++){
          if(count[j] > max){
              max= count[j];
              maxYear = j+1950;
          }
       }
        
        return maxYear;
       
    }
}