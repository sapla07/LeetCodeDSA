class Solution {
    public int titleToNumber(String columnTitle) {
        String s = columnTitle;
        int sum=0;
        for(char c : s.toUpperCase().toCharArray())
        {
            sum *= 26;
            sum += c - 'A' + 1;
        }
        
        return sum;
    }
}