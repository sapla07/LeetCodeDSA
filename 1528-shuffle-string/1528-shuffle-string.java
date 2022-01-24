class Solution {
    public String restoreString(String s, int[] indices) {
        String new_shuffle_string = "";
        char[] new_char_array = new char[indices.length];
        for(int i=0; i< indices.length; i++){
           new_char_array[indices[i]] = s.charAt(i);
        }
        
        new_shuffle_string = String.valueOf(new_char_array);
        
        return new_shuffle_string;
    }
}