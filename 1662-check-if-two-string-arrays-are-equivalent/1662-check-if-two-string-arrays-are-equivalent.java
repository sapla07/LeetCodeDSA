class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for(String word: word1){
            sb1.append(word);
        }
        
        for(String word: word2){
            sb2.append(word);
        }
        
        String check1 = sb1.toString();
        String check2 = sb2.toString();
        
        if(check1.equals(check2))
            return true;
        else
            return false;
    }
}