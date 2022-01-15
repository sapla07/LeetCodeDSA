class Solution {
    
     // Start from Last index of num Array
        /*
                          INDEX -> 0 1 2
        Explanation: let  num --> [2,3,2]
                          k   -->  8947
                     ADD num[LAST INDEX] + k  --> 2 + 8947 =  8949 --> k'   ADD(9) to LIST
                     Now ADD num[1] + (k' % 10) --> 3 + 894 = 897   --> k'   ADD(7) to LIST
                     Now ADD num[0] + (k' % 10) --> 2 + 89 = 91     --> k'   ADD(1) to LIST
                      k = k' % 10 = 9
                     At the End of the loop k != 0    So  
                     Now ADD DIGITS of k to list FROM the END     --> ADD(9) to List
                     Now k is 0 so END while Loop
                     
       At this point we have List as --> [9,7,1,9]  --> **Here NOTE that it is the REQUIRED ANS BUT **
	   IN REVERSE ORDER
                     --> So, now REVERSE the LIST 
                     --> At the END return the Required List           
         */
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