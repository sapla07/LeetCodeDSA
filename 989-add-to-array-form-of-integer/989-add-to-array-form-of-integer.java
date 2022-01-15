class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        
     List<Integer> res = new ArrayList<>();
        
        for(int i=num.length-1; i >=0 ; i--){
            int sum = num[i] + k;
            res.add(sum%10);
            k = sum/10;
        }
        
        while(k > 0){
            res.add(k%10);
            k /= 10;
        }
        
        Collections.reverse(res);
        
        return res;
         
}
}