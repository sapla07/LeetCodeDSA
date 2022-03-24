class Solution {
    public int findKthPositive(int[] arr, int k) {
        
        int[] res = new int[2001];
        int ans = -1;
        
        for(int i=0; i<arr.length; i++)
        {
            res[arr[i]] = 1;
        }
        
        for(int i=1; i < res.length; i++){
            
            if(res[i] == 0 && k > 0)
            {
                k--;
                ans = i;
            }
            
            continue;
        }
        
        return ans;
    }
}