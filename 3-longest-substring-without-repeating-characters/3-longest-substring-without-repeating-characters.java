class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int len = s.length();
        
        if(len <= 1)
        {
            return len;
        }
        
        HashMap<Character, Integer> hm = new HashMap<>();
        int start=0;
        int maxLen = 0;
        
        for(int end=0; end < len; end++){
            char echar = s.charAt(end);
            
            if(hm.containsKey(echar))
            {
                start = Math.max(start, (hm.get(echar) + 1 ));
            }
            
            hm.put(echar, end);
            maxLen = Math.max(maxLen, end - start + 1);
            
        }
        
        return maxLen;
       
    }
}