class Solution {
    public String sortSentence(String s) {
        
        String[] words = s.split(" ");
        String[] rearrange = new String[words.length];
        for(String word : words){
            
            int n = word.length();
            int index = Character.getNumericValue(word.charAt(n-1));
          
            rearrange[index-1] = word.substring(0,word.length()-1); 
            
        }
        
        StringBuilder sb = new StringBuilder("");
        
        for( String re : rearrange){
            sb.append(re).append(" ");
            
        }
        
       
        
        
       return sb.toString().trim(); 
    }
    
    
}