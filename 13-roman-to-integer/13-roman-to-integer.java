class Solution {
    public int romanToInt(String s) {
        
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
        
        hm.put('I',1);
        hm.put('V',5);
        hm.put('X',10);
        hm.put('L',50);
        hm.put('C',100);
        hm.put('D',500);
        hm.put('M',1000);
        
        int result = 0;
        
        for(int  i=s.length()-1 ; i >=1 ; i--){
            
            if(s.charAt(i) == 'X' && s.charAt(i-1) == 'I'){
                result = result + hm.get('X').intValue() - hm.get('I').intValue();                     i--;
                continue;
            }
            
            if(s.charAt(i) == 'V' && s.charAt(i-1) == 'I'){
                result = result + hm.get('V').intValue() - hm.get('I').intValue();
                
                i--;
                continue;
            }
            
            if(s.charAt(i) == 'L' && s.charAt(i-1) == 'X'){
                result = result + hm.get('L').intValue() - hm.get('X').intValue();
                i--;
                continue;
            }
            if(s.charAt(i) == 'C' && s.charAt(i-1) == 'X'){
                result = result + hm.get('C').intValue() - hm.get('X').intValue();
                i--;
                continue;
            }
            if(s.charAt(i) == 'D' && s.charAt(i-1) == 'C'){
                result = result + hm.get('D').intValue() - hm.get('C').intValue();
                i--;
                continue;
            }
            
            if(s.charAt(i) == 'M' && s.charAt(i-1) == 'C'){
                result = result + hm.get('M').intValue() - hm.get('C').intValue();
                i--;
                continue;
            }
            

            result = result + hm.get(s.charAt(i)).intValue();
            
           
            
        }
        
        
        if( s.length()>=2 && (s.charAt(1) == 'V' && s.charAt(0) == 'I' || s.charAt(1) == 'X' && s.charAt(0) == 'I' || s.charAt(1) == 'L' && s.charAt(0) == 'X' || s.charAt(1) == 'C' && s.charAt(0) == 'X'|| s.charAt(1) == 'D' && s.charAt(0) == 'C' || s.charAt(1) == 'M' && s.charAt(0) == 'C') ){
            return result;
        }
        else{
            result = result + hm.get(s.charAt(0));
             return result;
        }
        
        
        
       
        
    }
}