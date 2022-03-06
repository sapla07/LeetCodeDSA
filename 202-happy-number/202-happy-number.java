class Solution {
    public boolean isHappy(int n) {
        
        while(n >= 10)
        {
            int sum=0;
            while(n != 0 )
            {
                int sq = n%10;
                sum = sum + (int)Math.pow(sq,2);
                n = n/10;            
             }
         
             n = sum;
            
        }
        
        
        if(n == 1 || n == 7)
            return true;
        else
            return false;
        
    }
}