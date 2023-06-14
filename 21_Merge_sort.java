# NOT INPLACE SORTING

import java.util.Arrays;
import java.util.*;
public class merge_sort 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int n = sc.nextInt();
		
		System.out.println("Enter the elements of the array : ");
		int arr[] = new int[n];
		for(int i = 0 ; i < n ;i++)
		{
			arr[i] = sc.nextInt();
		}
		 arr = mergesort(arr);
		 
		 System.out.println(Arrays.toString(arr));

	}
	
	public static int[] mergesort(int arr[])
	{
	    if(arr.length == 1)
	    {
	    	return arr;
	    }
	    
	    int mid = arr.length/2;
	    
	    int left[] = mergesort(Arrays.copyOfRange(arr, 0, mid));
	    int right[] = mergesort(Arrays.copyOfRange(arr, mid, arr.length));
	    
	    
		return merge(left,right);
	}
	
	public static int[] merge(int[] left , int[] right)
	{
		int l = left.length;
		int r = right.length;
		int[] arr = new int[l+r];
		int i = 0 , j = 0 , k=0;
		while(i < l && j < r)
		{
			if(left[i] < right[j])
			{
				arr[k] = left[i];
				i++;
			}
			else
			{
				arr[k] = right[j];
				j++;
			}
			k++;
		}
		
		while(i < l)
		{
			arr[k] = left[i];
			i++;
			k++;
		}
		
		while(j < r)
		{
			arr[k] = right[j];
			j++;
			k++;
		}
		return arr;
		
	}

}



# INPLACE SORTING - MERGE SORT

import java.util.Arrays;
import java.util.*;
public class merge_sort 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int n = sc.nextInt();
		
		System.out.println("Enter the elements of the array : ");
		int arr[] = new int[n];
		for(int i = 0 ; i < n ;i++)
		{
			arr[i] = sc.nextInt();
		}
		mergesort_Inplace(arr,0,arr.length);
		 
		 System.out.println(Arrays.toString(arr));

	}
	
	public static void mergesort_Inplace(int arr[],int s, int e)
	{
	    if(e-s == 1)
	    {
	    	return ;
	    }
	    
	    int mid = (s+e)/2;
	    
	    mergesort_Inplace(arr, s, mid);
	    mergesort_Inplace(arr, mid, e);
	    
	    
		merge(arr,s,mid,e);
	}
	
	public static void merge(int[] arr ,int s,int mid , int e)
	{
		
		int i = s, j = mid , k=0;
		int[] arr_1 = new int[e-s];
		
		while(i < mid && j < e)
		{
 			if(arr[i] < arr[j])
			{
				arr_1[k] = arr[i];
				i++;
			}
			else
			{
				arr_1[k] = arr[j];
				j++;
			}
			k++;
		}
		
		while(i < mid)
		{
			arr_1[k] = arr[i];
			i++;
			k++;
		}
		
		while(j < e)
		{
			arr_1[k] = arr[j];
			j++;
			k++;
		}
		
		for(int a = 0 ; a < arr_1.length;a++)
		{
			arr[s+a]  = arr_1[a];
		}
	}

}

