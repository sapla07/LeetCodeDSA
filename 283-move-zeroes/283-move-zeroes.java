public class Solution {

public void moveZeroes(int[] nums) {

   int leftmostindexes=0;
   int len = nums.length;  
   for(int i=0; i< len; i++)
   {
       if(nums[i]!=0)
       {
           if(i > leftmostindexes)
           {
               nums[leftmostindexes] = nums[i];
               nums[i]=0;
           }
           
           leftmostindexes++;
       }
       
   }
}
}
        
       