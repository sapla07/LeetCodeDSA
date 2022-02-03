class Solution {
    public int romanToInt(String s) {  
        
        int n = s.length();
        int res= 0;

       
        
        for(int i=0; i< n-1; i++ ){
            int a = getValue(s.charAt(i));
            int b = getValue(s.charAt(i+1));
            
            if(a < b){
                res-=a;
            }
            else{
                res+=a;
            }
        }
                
        res = res + getValue(s.charAt(n-1));        
       
       return res; 
    }
    
    static int getValue(char c){
            if(c == 'I') return 1;
            else if(c == 'V') return 5;
            else if(c == 'X') return 10;
            else if(c == 'L') return 50;
            else if(c == 'C') return 100;
            else if(c == 'D') return 500;
            else 
                return 1000;                        
        }
}