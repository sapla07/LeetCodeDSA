class Solution {
    public int findNumbers(int[] nums) {
        
        int countEven = 0;
        
        for(int i=0; i< nums.length; i++){
            
            int temp = nums[i];
            
            int digitCount= 0;
            
            while(temp != 0){
                digitCount++;
                temp=temp/10;
                
            }
            
            if(digitCount%2 == 0){
                countEven++;
            }
            
        }
        
        return countEven;
        
    }
}