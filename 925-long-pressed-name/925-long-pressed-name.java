class Solution {
    public boolean isLongPressedName(String name, String typed) {
        
        int len_name = name.length();
        int len_typed = typed.length();
        int i =0;
        int j=0;
        
        if(len_typed < len_name)
            return false;
        
       while(i < len_name && j < len_typed){
           
           char c1 = name.charAt(i);
           char c2 = typed.charAt(j);
           
           if(c1 != c2)
               return false;
           
           int count1=0;
           while(i < len_name && name.charAt(i)==c1){
               count1++;
               i++;
           }
           
           int count2=0;
           while(j < len_typed && typed.charAt(j)==c2){
               count2++;
               j++;
           }
           
           if(count2 < count1)
               return false;
       }
        
        return i==len_name && j==len_typed;
        
    }
}