class Solution {
    public boolean isPalindrome(String s) {
        
        StringBuilder sb = new StringBuilder(s.toLowerCase());
        int idx=0;
        
        while(idx < sb.length())
        {
           char ch = sb.charAt(idx);
           if(Character.isLetterOrDigit(ch))
               idx++;
            else
                sb.deleteCharAt(idx);        
        }
        
        int n = sb.length();
        
        for(int i=0; i<n/2; i++)
        {
            int j = n-i-1;
            if(sb.charAt(i) != sb.charAt(j))
                return false;
        }
        
        return true;
        
    }
}