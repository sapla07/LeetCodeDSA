class Solution {
    public int numOfStrings(String[] patterns, String word) {
        
        int count = 0;
        
        for(int i=0; i< patterns.length; i++){
            
            
            String checksub = patterns[i];
            
            if(word.contains(checksub)){
                count++;
            }          
 
        }
        
        return count;
    }
}