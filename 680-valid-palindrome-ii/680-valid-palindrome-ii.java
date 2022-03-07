class Solution {
    public boolean validPalindrome(String s) {
        
        int left = 0;
        int Right = s.length()-1;
        
        while(left < Right)
        {
            if(s.charAt(left) != s.charAt(Right))
            {
                return isValidPalindrome(left+1, Right, s) || 
                    isValidPalindrome(left, Right-1, s);
                    
            }
            
            left++;
            Right--;
        }   
        
        return true;
    }
    
    
    public boolean isValidPalindrome(int i, int j, String sub)
    {
        int left = i;
        int Right = j;
        
        while(left < Right)
        {
            if(sub.charAt(left) != sub.charAt(Right))
            {
                return false;
            }
            
            left++;
            Right--;
        }
        
        return true;            
    }

}