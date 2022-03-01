class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        
        for(int i=0; i<k; i++){
            
            int min = Integer.MAX_VALUE;
            int index = -1;
            
            for(int j=0; j < nums.length; j++){
                if(nums[j] < min){
                    min = nums[j];
                    index = j;
                }
            }
            
            if (min == 0)
                break;
            
            nums[index] = -nums[index];
        }
         
        
        int count = 0;
        for(int i=0; i<nums.length; i++){
            count += nums[i];
        }
        return count;      
           
                   
    }
    
    
}