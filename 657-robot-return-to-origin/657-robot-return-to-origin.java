class Solution {
    public boolean judgeCircle(String moves) {
        
        int countU = 0;
        int countD = 0;
        int countL = 0;
        int countR = 0;
        
        for(int i=0; i < moves.length(); i++){
            
            if(moves.charAt(i) == 'U')
            {
                countU += 1;
            }
            else if(moves.charAt(i) == 'D'){
                countD += 1;
            }
            else if(moves.charAt(i) == 'L'){
                countL += 1;
            }
            else{
                countR += 1;
            }
            
            
        }
        
        if(countU == countD && countL == countR)
            return true;
        else
            return false;
    }
}