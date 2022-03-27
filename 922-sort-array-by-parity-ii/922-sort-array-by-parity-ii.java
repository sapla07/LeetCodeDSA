class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        
        int even = 0;
        int odd = 1;
        
        while(even < nums.length && odd < nums.length)
        {
            if(nums[even]%2 !=0 )
            {
                swap(nums, even, odd);
                odd+=2;
            }
            else
            {
                even+=2;
            }
        }
        
        return nums;
     
    }
    
    public void swap(int[] arr, int e1, int o1)
    {
        int t = arr[e1];
        arr[e1] = arr[o1];
        arr[o1] = t;
        
    }
}