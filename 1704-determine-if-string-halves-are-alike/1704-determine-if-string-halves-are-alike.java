class Solution {
    public boolean halvesAreAlike(String s) {
        int len = s.length();
        String verify = "aeiouAEIOU";
        int count = 0;
        
        for(int i=0; i< len; i++){
            if( i < len/2){
                if(verify.contains(s.charAt(i)+""))
                    count++;
            }
            else{
                if(verify.contains(s.charAt(i)+""))
                    count--;
            }
        }
        
        if(count == 0)
            return true;
        else
            return false;
    
    }
}