class Solution {
    public void sortColors(int[] nums) {
       int len = nums.length;
       int lo = 0;
       int high = len-1;
       int mid=0, temp=0;
        
       while(mid <= high){
           
           switch(nums[mid]){
                
               case 0: {
                   temp = nums[lo];
                   nums[lo] = nums[mid];
                   nums[mid] = temp;
                   lo++;
                   mid++;
                   break;   
               }
               case 1: {
                   mid++;
                   break;
                   
               }
               case 2: {
                   temp = nums[mid];
                   nums[mid] = nums[high];
                   nums[high] = temp;
                   high--;
                   break; 
               }
                   
           }
           
       }        
        
        
    }
}