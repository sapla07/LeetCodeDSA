class Solution {
    public boolean halvesAreAlike(String s) {
        int n = s.length();
        String fh = s.substring(0, n/2);
        String sh = s.substring(n/2, n);
        int count1 = 0;
        int count2 = 0;
        
        for(int i=0; i< fh.length(); i++){
            if(fh.charAt(i) == 'a' || fh.charAt(i) == 'e' || fh.charAt(i) == 'i' ||fh.charAt(i) == 'o' ||fh.charAt(i) == 'u' ||fh.charAt(i) == 'A' ||fh.charAt(i) == 'E' ||fh.charAt(i) == 'I' ||fh.charAt(i) == 'O' ||fh.charAt(i) == 'U')
                count1++;               
                
        }
        
        for(int i=0; i< sh.length(); i++){
            if(sh.charAt(i) == 'a' || sh.charAt(i) == 'e' || sh.charAt(i) == 'i' ||sh.charAt(i) == 'o' ||sh.charAt(i) == 'u' ||sh.charAt(i) == 'A' ||sh.charAt(i) == 'E' ||sh.charAt(i) == 'I' ||sh.charAt(i) == 'O' ||sh.charAt(i) == 'U')
                count2++;  
                
                
        }
        
        if(count1 == count2)
            return true;
        else
            return false;
    }
}