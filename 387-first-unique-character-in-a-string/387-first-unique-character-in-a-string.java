class Solution {
    public int firstUniqChar(String s) {
        int[] freq = new int[26];
        
        for(char p : s.toCharArray())
        {
             
            freq[p-'a']++;
        }
        
        for(int i=0; i<s.length(); i++)
        {
            char ch = s.charAt(i);
            
            for(int j=0; j< freq.length; j++)
            {
                if(freq[ch-'a'] == 1 )
                    return i;
            }
        }
        
        
        return -1;
    }
}