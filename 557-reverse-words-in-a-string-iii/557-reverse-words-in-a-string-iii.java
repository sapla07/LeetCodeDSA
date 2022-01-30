class Solution {
    public String reverseWords(String s) {
        
        String[] temp = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(String  t : temp){
            sb.append(" ").append(reverse(t));
            
        }
        
        return sb.toString().substring(1);
        
    }
    
    static String reverse(String st){
        StringBuilder sf = new StringBuilder(st);
        return sf.reverse().toString();
    }
}