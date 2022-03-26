// { Driver Code Starts
import java.util.*;

class GFG
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			int n = sc.nextInt();
			int arr[] = new int[n]; 
			for(int i=0;i<n;i++)
			{
				arr[i] = sc.nextInt();
			}
		
			Solution obj = new Solution();
			obj.selectionSort(arr, n);
			
			for(int i=0;i<n;i++)
		    	System.out.print(arr[i]+" ");
		    System.out.println();
			t--;
		}
		
	}
}
// } Driver Code Ends


class Solution
{
	int  select(int arr[], int i)
	{
        // code here such that selectionSort() sorts arr[]
        
        int min = Integer.MAX_VALUE, temp = i;
        for(int j=i; j< arr.length; j++)
        {
            if(arr[j] <  min)
            {
                min = arr[j];
                temp = j;
            }
        }
        
        return temp;
        
	}
	
	void selectionSort(int arr[], int n)
	{
	    //code here
	    
	    int pos = 0;
	    int temp = 0;
	    
	    while(pos < arr.length-1)
	    {
	        int min_pos = select(arr, pos);
	        temp = arr[min_pos];
	        arr[min_pos] = arr[pos];
	        arr[pos] = temp;
	        pos++;
	    }
	    
	}
}