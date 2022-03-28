class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        List<Integer> res = new ArrayList<>();
        
        int i =0;
        
        while( i < nums.length)
        {
            int correct = nums[i]-1;
            if(nums[i] != nums[correct])
            {
                swap(nums, i, correct);
            }
            else
                i++;
        }
        
        for(int j=0; j <nums.length; j++)
        {
            if(nums[j] != j+1)
               res.add(j+1); 
        }
        
    
           
     return res;
        
    }
    
    static void swap(int[] arr,int first, int second)
    {
        int t = arr[first];
        arr[first] = arr[second];
        arr[second] = t;
    }
    
    
}