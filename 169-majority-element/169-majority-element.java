class Solution {
    public int majorityElement(int[] nums) {
     
        HashMap<Integer, Integer> hm = new HashMap<>();
        int ret=0;
        for(int num : nums)
        {
            if(!hm.containsKey(num))
                hm.put(num,1);
            else
                hm.put(num, hm.get(num)+1);
                
            if(hm.get(num)>nums.length/2)
            {
                ret = num;
                break;
            }
                
                
        }
        
        return ret;

    }
}