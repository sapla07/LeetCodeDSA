class Solution {
    public int[] findErrorNums(int[] nums) {
        
        int i=0;
        while(i < nums.length)
        {
            int correct = nums[i]-1;
            if(nums[i] != nums[correct])
            {
                swap(nums, i, correct);
            }
            else
                i++;
        }
        
        for(int index=0; index < nums.length; index++)
        {
            if(nums[index] != index+1 )
            {
                return new int[]{nums[index], index+1};
            }
                
        }
        
       return new int[]{-1, -1}; 
    }
    
    public void swap(int[] arr, int first, int second) {

        int t = arr[first];
        arr[first] = arr[second];
        arr[second] = t;

    }
}