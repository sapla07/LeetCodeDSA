class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int[] countboxtype = new int[1001];
        int len = countboxtype.length;
        int ans = 0;
        int T = truckSize;
        
        for(int [] boxType : boxTypes){
            countboxtype[boxType[1]] += boxType[0];
        }
        
        for(int i=len-1; i>=0; i--){
            if(countboxtype[i] == 0) continue;
            
            int num = Math.min(countboxtype[i], T);
            ans += num*i;
            T -= num;
            if(T == 0) break;           
        }
        
        return ans;
    }
}