class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        
        List<Integer> list = new ArrayList<>();
        int k =  p.length();
        int n =  s.length();
        int left = 0;
        int right =0;
        int counter = k;
        int[] freq = new int[26];
        
        for(char ch : p.toCharArray())
        {
            freq[ch-'a']++;
        }
        
        while(right < n)
        {
            char rch = s.charAt(right);
            
            if(freq[rch-'a'] > 0 )
            {
                counter--;
            }
            
            freq[rch-'a']--;
            
            if(right-left+1 == k)
            {
                if(counter == 0)
                {
                    list.add(left);
                }
                
                
                char lch = s.charAt(left);
                
                if(freq[lch-'a'] >=0)
                {
                    counter++;
                }
                
                freq[lch-'a']++;
                
                left++;
            }
            
            right++;
            
            
        }
        
        return list;
    }
}