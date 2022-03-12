class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        List<Integer> list = new ArrayList<>();
        
        int top = 0;
        int bottom = 0;
        
        while(true)
        {
            if(top >= nums1.length || bottom >= nums2.length)
                break;
            if(nums1[top] == nums2[bottom])
            {
                list.add(nums1[top]);
                top++;
                bottom++;
            }
            else if(nums1[top] > nums2[bottom])
                bottom++;
            else if(nums1[top] < nums2[bottom])
                top++;           
            
        }
        
        int[] res = new int[list.size()];
        for(int i=0; i<res.length; i++)
        {
            res[i] = list.get(i);
        }
        
        return res;
            
        
    }
}