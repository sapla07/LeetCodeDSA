class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {        
               
        List<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> hm = new HashMap<>();
        
       for(int i : nums1) hm.put(i, hm.getOrDefault(i,0)+1);
       for(int i : nums2)
       {
           if(hm.getOrDefault(i,0) != 0)
           {
               list.add(i);
               hm.put(i,hm.getOrDefault(i,1)-1);
           }
       }
        
        int[] arr = new int[list.size()];
        for(int i=0; i < list.size(); i++)
        {
            arr[i] = list.get(i);
        }

       
        return arr;
    }
}