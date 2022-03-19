class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int[] ans = new int[2];        
               
        int startIndex = -1;
        int endIndex = -1;
        
        for(int i=0; i< nums.length; i++)
        {
            if(nums[i]==target && startIndex==-1)
                startIndex = i;            
            else if(nums[i]==target)
                endIndex = i;
            else
                continue;
                
        }
        
        if(startIndex != -1 && endIndex == -1)
            endIndex = startIndex;
        
        if(endIndex != -1 && startIndex == -1)
            startIndex = endIndex;
        
         ans[0] = startIndex;
         ans[1] = endIndex;
        
        return ans;
        
    }
}