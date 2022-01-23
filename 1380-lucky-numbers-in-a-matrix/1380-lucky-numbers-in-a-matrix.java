class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        
      int m = matrix.length;
      int n = matrix[0].length;
      int[] min_ele = new int[m];
      int[] max_ele = new int[n];
      ArrayList<Integer> arr = new ArrayList<>();
        
      Arrays.fill(min_ele, Integer.MAX_VALUE);
      Arrays.fill(max_ele, Integer.MIN_VALUE);
      
     for(int i=0; i < m; i++){
         for(int j=0; j < n; j++){
             min_ele[i] = Math.min(min_ele[i], matrix[i][j]);
             max_ele[j] = Math.max(max_ele[j], matrix[i][j]);
         }
     }
     
        for(int i=0; i < m; i++){
         for(int j=0; j < n; j++){
             if(min_ele[i] == max_ele[j]){
                    arr.add(min_ele[i]);
             }
         }
     } 
        
        
        return arr;
        
    }
}