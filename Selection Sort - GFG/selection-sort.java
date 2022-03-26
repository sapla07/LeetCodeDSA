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
	int  select(int arr[], int start, int end)
	{
        // code here such that selectionSort() sorts arr[]
        
        int max = start; 
        for(int j=start; j<=end; j++)
        {
            if(arr[max] < arr[j])
            {
                max = j;
            }
        }
        
        return max;
        
	}
	
	void selectionSort(int arr[], int n)
	{
	    //code here
	    
	   for(int i=0; i< n; i++)
	   {
	       int last = n-i-1;
	       int max_index = select(arr, 0, last);
	       swap(arr, max_index, last);
	   }
	    
	}
	
	void swap(int[] arr, int first, int second)
	{
	    int temp = arr[first];
	    arr[first] = arr[second];
	    arr[second] = temp;
	}
}