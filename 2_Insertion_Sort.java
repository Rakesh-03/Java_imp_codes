import java.util.*;

public class insertion_sort {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array :");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the numbers for Insertion sort: ");
		for(int i = 0 ; i < n;i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		System.out.println();
		sort(arr);
		System.out.println(Arrays.toString(arr));

	}
	
	public static void sort(int arr[])
	{
	  for(int i = 0 ; i < arr.length-1;i++)
	  {
		for(int j = i+1;j>0;j--)
		{
			if(arr[j]<arr[j-1])
			{
				int temp = arr[j];
				arr[j] = arr[j-1];
				arr[j-1] = temp;
			}
		}
		System.out.println(Arrays.toString(arr));
	  }
	  System.out.println();
	}
	
}
