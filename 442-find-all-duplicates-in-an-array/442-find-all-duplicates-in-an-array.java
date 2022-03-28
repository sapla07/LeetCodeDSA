class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        
        ArrayList<Integer> res = new ArrayList<>();
        
        int i=0;
        while(i < nums.length)
        {
           int correct = nums[i]-1;
            if(nums[i] != nums[correct])
            {
               swap(nums, i, correct);
              } else{
                     i++;
            } 
            
           
               
        }
        
        for(int index=0; index< nums.length; index++)
        {
            if(nums[index] != index+1)
                res.add(nums[index]);
        }
            
       return res;  
    }
    
    public void swap(int[] arr, int first, int second) {

        int t = arr[first];
        arr[first] = arr[second];
        arr[second] = t;

    }
}