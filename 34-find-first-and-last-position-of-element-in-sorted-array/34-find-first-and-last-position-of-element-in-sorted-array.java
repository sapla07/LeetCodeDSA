class Solution {
    public int[] searchRange(int[] nums, int target) {
      
        int[] result = new int[2];
        result[0] = firstOccurence(nums, target);
        result[1] = lastOccurence(nums, target);
        
        return result;      
        
    } 
    
    public int firstOccurence(int[] nums,int target){
        
        int low=0;
        int high=nums.length-1;
        int result=-1;
        while(low <= high)
        {
            int mid = low + ((high-low)/2);
                
            if(nums[mid] < target)
                low = mid+1;
            else if(nums[mid] >  target)
                high = mid-1;
            else{
                result = mid;
                high = mid-1;
            }
                            
        }
        
        return result;
        
    }
    
    public int lastOccurence(int[] nums, int target){
        
        int low=0;
        int high=nums.length-1;
        int result=-1;
        while(low <= high)
        {
            int mid = low + ((high-low)/2);
                
            if(nums[mid] < target)
                low = mid+1;
            else if(nums[mid] >  target)
                high = mid-1;
            else{
                result = mid;
                low = mid+1;
            }
                            
        }
        
        return result;
        
    }
    
        
}