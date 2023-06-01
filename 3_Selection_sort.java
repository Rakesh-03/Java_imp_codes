import java.util.*;
import java.util.Scanner;

public class selection_sort {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array :");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the numbers for Selection sort: ");
		for(int i = 0 ; i < n;i++)
		{
			arr[i] = sc.nextInt();
		}
		sort(arr);
		System.out.println(Arrays.toString(arr));

	}
	
	public static void sort(int arr[])
	{
		for(int i = 0 ; i < arr.length;i++)
		{
			int last = arr.length-i-1;
			int max_ele=get_max(arr,0,last);
			swap(arr,max_ele,last);
		}
	}
	
	public static int[] swap(int arr[],int max_ele,int last)
	{
		int temp = arr[max_ele];
		arr[max_ele] = arr[last];
		arr[last] = temp;
		
		return arr;
	}
	public static int get_max(int arr[],int s,int e)
	{
		int max = s;
		for(int i = s ; i <= e;i++)
		{
		  if(arr[max]<arr[i])
		  {
			 max = i;
		   }
		}
		return max;
	}

}
