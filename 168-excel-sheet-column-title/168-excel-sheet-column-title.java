class Solution {
    public String convertToTitle(int columnNumber) {
        
      StringBuilder result = new StringBuilder();
      int n = columnNumber;
        while(n > 0){
            n--;
            result.append((char)('A' + n%26));
            n = n/26;                
        }
        
        return result.reverse().toString();
        
        
        
    }
}